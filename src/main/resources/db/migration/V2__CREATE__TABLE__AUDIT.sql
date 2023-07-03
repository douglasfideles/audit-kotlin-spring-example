-- Add columns for auditing with Envers
ALTER TABLE Users ADD COLUMN created_by varchar(255);
ALTER TABLE Users ADD COLUMN modified_by varchar(255);

CREATE TABLE revinfo
(
    rev integer PRIMARY KEY,
    revtstmp bigint
);


CREATE TABLE users_aud
(
    id serial PRIMARY KEY,
    rev integer NOT NULL,
    revtype smallint,
    age integer,
    age_mod boolean,
    name character varying(255),
    name_mod boolean,
   foreign key (rev) REFERENCES revinfo (rev)

);