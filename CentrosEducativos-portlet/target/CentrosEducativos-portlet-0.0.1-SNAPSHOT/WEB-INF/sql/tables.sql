create table CentrosEducativos_CategoriaPregunta (
	idcategoria INTEGER not null primary key,
	Categoria VARCHAR(75) null
);

create table CentrosEducativos_CentroEducativo (
	idce INTEGER not null primary key,
	nombrece VARCHAR(75) null,
	idca INTEGER
);

create table CentrosEducativos_ComunidadAutonoma (
	idca INTEGER not null primary key,
	nombrecomunidad VARCHAR(75) null,
	idpais INTEGER
);

create table CentrosEducativos_EvaluacionesCE (
	idencuesta INTEGER not null,
	numpregunta INTEGER not null,
	notapregunta INTEGER,
	idce INTEGER,
	idrol INTEGER,
	primary key (idencuesta, numpregunta)
);

create table CentrosEducativos_Pais (
	idpais INTEGER not null primary key,
	nombrepais VARCHAR(75) null
);

create table CentrosEducativos_PreguntasEncuesta (
	numpregunta INTEGER not null primary key,
	enunciadopregunta VARCHAR(75) null,
	idcategoria LONG
);

create table CentrosEducativos_RolUsuario (
	idrol INTEGER not null primary key,
	nombrerol VARCHAR(75) null
);

create table CentrosEducativos_Usuario (
	usuarioId LONG not null primary key,
	cursoAcademico VARCHAR(75) null,
	haContestadoLaEncuesta BOOLEAN,
	idrol LONG,
	idce LONG
);