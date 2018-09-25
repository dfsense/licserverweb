
------------ CREATE TABLE licsrv.roles ------------

CREATE TABLE licsrv.roles
(
  id serial NOT NULL,
  name character varying(100) NOT NULL,
  CONSTRAINT roles_pkey PRIMARY KEY (id),
  CONSTRAINT roles_name_key UNIQUE (name)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE licsrv.roles
  OWNER TO lic_db;

----- ------ CREATE TABLE licsrv.users -------------

CREATE TABLE licsrv.users
(
  id serial NOT NULL,
  name character varying(255) NOT NULL,
  password character varying(255) NOT NULL,
  CONSTRAINT users_pkey PRIMARY KEY (id),
  CONSTRAINT users_name_key UNIQUE (name)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE licsrv.users
  OWNER TO lic_db;

----- ------ CREATE TABLE licsrv.user_roles -------------

CREATE TABLE licsrv.user_roles
(
  id_user integer NOT NULL,
  id_role integer NOT NULL,
  CONSTRAINT user_roles_pkey PRIMARY KEY (id_user, id_role),
  CONSTRAINT user_roles_id_role_fkey FOREIGN KEY (id_role)
      REFERENCES licsrv.roles (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT user_roles_id_user_fkey FOREIGN KEY (id_user)
      REFERENCES licsrv.users (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE licsrv.user_roles
  OWNER TO lic_db;