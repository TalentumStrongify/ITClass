package CustomPostLoginAction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

public class CustomPostLoginAction extends Action {

	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) throws ActionException {
		
		User user = null;
		
		long orgId = 0;
		long adminTelefonicaId = 21239; 
		long superAdminId = 20199;
		String path = null;

		try {
			user = PortalUtil.getUser(request);
			
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (SystemException e) {
			e.printStackTrace();
		}

		try {
			if (adminTelefonicaId == user.getUserId()) {
				// Usuario Admin Telefonica
				path = "/web/telefonica1";
			} else if (superAdminId == user.getUserId()) {
				// Usuario superAdmin
				path = "/web/guest/home";
			} else {

				// Usuario familia/docente/alumno
				orgId = OrganizationLocalServiceUtil.getUserOrganizations(user.getUserId()).get(0).getOrganizationId();
				path = "/web/colegio" + orgId;
				// En administracion del portal se definen los FriendlyURL de
				// cada Organizacion colegio "/colegio[id Organizacion del
				// colegio concreto]"

			}

		} catch (SystemException e) {
			e.printStackTrace();
		}
		//seteamos el path con esta sesion en portal.properties
		LastPath publiclastPath = new LastPath(StringPool.BLANK, path);
		HttpSession session = request.getSession();
		session.setAttribute(WebKeys.LAST_PATH, publiclastPath);

	}

}


