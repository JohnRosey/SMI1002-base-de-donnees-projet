
--DATA TO INSERT
INSERT INTO FILM (FILM_ID, FILM_TITRE, FILM_LANGUE, FILM_TEMPS, FILM_TYPE, FILM_DATE_DE_SORTIE,  REALISATEUR, PAYS_DE_PRODUCTION) VALUES ('14486', 'SIA LE RÊVE DU PYTHON', 'Français', '90', 'drame',  '929', 'Dani Kouyaté', 'BURKINA FASO');

INSERT INTO SMI1002_011.FILM (FILM_ID, FILM_TITRE, FILM_LANGUE, FILM_TEMPS, FILM_TYPE, FILM_DATE_DE_SORTIE,  REALISATEUR, PAYS_DE_PRODUCTION) VALUES (14486, 'SIA LE RÊVE DU PYTHON', 'Français', '90', 'drame', '929', 'Dani Kouyaté', 'BURKINA FASO');
INSERT INTO SMI1002_011.FILM (FILM_ID, FILM_TITRE, FILM_LANGUE, FILM_TEMPS, FILM_TYPE, FILM_DATE_DE_SORTIE,  REALISATEUR, PAYS_DE_PRODUCTION) VALUES (26548, 'ALI ZAOUA PRINCE DE LA RUE', 'Français', '90', 'drame',  '927', '	Nabil Ayouch', 'MAROC');
INSERT INTO SMI1002_011.FILM (FILM_ID, FILM_TITRE, FILM_LANGUE, FILM_TEMPS, FILM_TYPE, FILM_DATE_DE_SORTIE,  REALISATEUR, PAYS_DE_PRODUCTION) VALUES (36545, 'LE FAUTEUIL', 'Français', '92', 'drame',  '930', 'Missa Hébié', 'BURKINA FASO');
INSERT INTO SMI1002_011.FILM (FILM_ID, FILM_TITRE, FILM_LANGUE, FILM_TEMPS, FILM_TYPE, FILM_DATE_DE_SORTIE,  REALISATEUR, PAYS_DE_PRODUCTION) VALUES (43540, 'EN ATTENDANT LE BONHEUR', 'Français', '90', 'drame', '925', 'Abderrahmane Sissako', 'MAURITANIE');
INSERT INTO SMI1002_011.FILM (FILM_ID, FILM_TITRE, FILM_LANGUE, FILM_TEMPS, FILM_TYPE, FILM_DATE_DE_SORTIE,  REALISATEUR, PAYS_DE_PRODUCTION) VALUES (58525, 'UN HOMME QUI CRIE', 'Français', '95', 'guerre',  '926', 'Mahamat-Saleh Haroun', 'TCHAD');
INSERT INTO SMI1002_011.FILM (FILM_ID, FILM_TITRE, FILM_LANGUE, FILM_TEMPS, FILM_TYPE, FILM_DATE_DE_SORTIE,  REALISATEUR, PAYS_DE_PRODUCTION) VALUES (65653, 'NOTRE ÉTRANGÈRE', 'Français', '82', 'Comédie',  '924', 'Sarah Bouyain', 'BURKINA FASO');
INSERT INTO SMI1002_011.FILM (FILM_ID, FILM_TITRE, FILM_LANGUE, FILM_TEMPS, FILM_TYPE, FILM_DATE_DE_SORTIE,  REALISATEUR, PAYS_DE_PRODUCTION) VALUES (75266, 'LE MEC IDÉAL', 'Français', '110', 'Comédie',  '923', 'Owell Brown', 'COTE D`IVOIRE');
INSERT INTO SMI1002_011.FILM (FILM_ID, FILM_TITRE, FILM_LANGUE, FILM_TEMPS, FILM_TYPE, FILM_DATE_DE_SORTIE,  REALISATEUR, PAYS_DE_PRODUCTION) VALUES (88552, 'TEZA', 'Français', '140', 'drame', '920', 'Haile Gerima', 'ETHIOPIE');
INSERT INTO SMI1002_011.FILM (FILM_ID, FILM_TITRE, FILM_LANGUE, FILM_TEMPS, FILM_TYPE, FILM_DATE_DE_SORTIE,  REALISATEUR, PAYS_DE_PRODUCTION) VALUES (95236, 'LINGUI, LES LIENS SACRÉS', 'Français', '95', 'drame',  '919', 'Mahamat-Saleh Haroun', 'TCHAD');



insert into SMI1002_011.CLIENT (CLIENT_ID, CLIENT_NOM, CLIENT_TEL, CLIENT_EMAIL, CLIENT_ADRESSE, CLIENT_PRENOM) values (16, 'JAMES', '4359785424', 'JAMESBOND@YAHOO.FR', 'Manhattan, NY 10036, États-Unis', 'JAMES');
insert into SMI1002_011.CLIENT (CLIENT_ID, CLIENT_NOM, CLIENT_TEL, CLIENT_EMAIL, CLIENT_ADRESSE, CLIENT_PRENOM) values (12, 'MUSK', '4379785420', 'ELONMUSK@YAHOO.FR', '860 Washington St, New York, NY 10014, États-Unis', 'ELON');
insert into SMI1002_011.CLIENT (CLIENT_ID, CLIENT_NOM, CLIENT_TEL, CLIENT_EMAIL, CLIENT_ADRESSE, CLIENT_PRENOM) values (13, ' TIM', '4349785421', 'TIMCOOK@YAHOO.FR', 'Apple Valley, CA 92307, États-Unis', 'TIM');
insert into SMI1002_011.CLIENT (CLIENT_ID, CLIENT_NOM, CLIENT_TEL, CLIENT_EMAIL, CLIENT_ADRESSE, CLIENT_PRENOM) values (14, 'BILL', '4319785422', 'BILLGATES@YAHOO.FR', '75 Enterprise # 100, Aliso Viejo, CA 92656, États-Unis', 'BILL');
insert into SMI1002_011.CLIENT (CLIENT_ID, CLIENT_NOM, CLIENT_TEL, CLIENT_EMAIL, CLIENT_ADRESSE, CLIENT_PRENOM) values (15, 'JACK', '4309785423', 'JACKDOSEY@YAHOO.FR', '150 Pico Blvd, Santa Monica, CA 90405, États-Unis', 'JACK');
insert into SMI1002_011.CLIENT (CLIENT_ID, CLIENT_NOM, CLIENT_TEL, CLIENT_EMAIL, CLIENT_ADRESSE, CLIENT_PRENOM) values (16, 'JAMES', '4359785424', 'JAMESBOND@YAHOO.FR', '1157 N Highland Ave, Los Angeles, CA 90038, États-Unis', 'JAMES');


--TABLE TO CREATE
CREATE TABLE film (
    film_id              INTEGER NOT NULL,
    film_titre           VARCHAR2(50),
    film_langue          VARCHAR2(50),
    film_temps           DATE,
    film_date_de_sortie  TIMESTAMP

    ,
    realisateur          VARCHAR2(25),
    pays_de_production   VARCHAR2(20),
    film_type            VARCHAR2(25)
);

ALTER TABLE film ADD CONSTRAINT film_pk PRIMARY KEY ( film_id );


CREATE TABLE billet (
    id                INTEGER NOT NULL,
    nombre_de_billet  INTEGER,
    date_heure        TIMESTAMP,
    type_paiement     VARCHAR2(50),
    film_titre        VARCHAR2(50),
    client_id         INTEGER NOT NULL,
    film_film_id      INTEGER NOT NULL
);

ALTER TABLE billet ADD CONSTRAINT billet_pk PRIMARY KEY ( id );

ALTER TABLE billet
    ADD CONSTRAINT billet_client_fk FOREIGN KEY ( client_id )
        REFERENCES client ( id );
ALTER TABLE billet
    ADD CONSTRAINT billet_film_fk FOREIGN KEY ( film_film_id )
        REFERENCES film ( film_id );

CREATE TABLE caissier (
    nom          VARCHAR2(50),
    prenom       VARCHAR2(20),
    adresse      VARCHAR2(50),
    salaire      NUMBER,
    caissier_id  INTEGER NOT NULL
);

ALTER TABLE caissier ADD CONSTRAINT caissier_pk PRIMARY KEY ( caissier_id );


CREATE TABLE client (
    id       INTEGER NOT NULL,
    nom      VARCHAR2(50),
    prenom   VARCHAR2(50),
    email    VARCHAR2(50),
    adresse  VARCHAR2(50)
);
ALTER TABLE client ADD CONSTRAINT client_pk PRIMARY KEY ( id );

CREATE UNIQUE INDEX billet__idx ON
    billet (
        client_id
    ASC );

CREATE UNIQUE INDEX billet__idxv1 ON
    billet (
        film_film_id
    ASC );



---INSTRUCTIONS GENERER PAR ORACLE
CREATE TABLE billet (
    id                INTEGER NOT NULL,
    nombre_de_billet  INTEGER,
    date_heure        TIMESTAMP,
    type_paiement     VARCHAR2(50),
    film_titre        VARCHAR2(50),
    client_id         INTEGER NOT NULL,
    film_film_id      INTEGER NOT NULL
);

CREATE UNIQUE INDEX billet__idx ON
    billet (
        client_id
    ASC );

CREATE UNIQUE INDEX billet__idxv1 ON
    billet (
        film_film_id
    ASC );

ALTER TABLE billet ADD CONSTRAINT billet_pk PRIMARY KEY ( id );

CREATE TABLE caissier (
    nom          VARCHAR2(50),
    prenom       VARCHAR2(20),
    adresse      VARCHAR2(50),
    salaire      NUMBER,
    caissier_id  INTEGER NOT NULL
);

ALTER TABLE caissier ADD CONSTRAINT caissier_pk PRIMARY KEY ( caissier_id );

CREATE TABLE client (
    id       INTEGER NOT NULL,
    nom      VARCHAR2(50),
    prenom   VARCHAR2(50),
    email    VARCHAR2(50),
    adresse  VARCHAR2(50)
);

ALTER TABLE client ADD CONSTRAINT client_pk PRIMARY KEY ( id );

CREATE TABLE film (
    film_id              INTEGER NOT NULL,
    film_titre           VARCHAR2(50),
    film_langue          VARCHAR2(50),
    film_temps           DATE,
    film_date_de_sortie  unknown 
--  ERROR: Datatype UNKNOWN is not allowed 
    ,
    realisateur          VARCHAR2(25),
    pays_de_production   VARCHAR2(20),
    film_type            VARCHAR2(25)
);

ALTER TABLE film ADD CONSTRAINT film_pk PRIMARY KEY ( film_id );

CREATE TABLE regarde (
    film_film_id  INTEGER NOT NULL,
    client_id     INTEGER NOT NULL
);

ALTER TABLE regarde ADD CONSTRAINT relation_14_pk PRIMARY KEY ( film_film_id,
                                                                client_id );

CREATE TABLE sers (
    caissier_caissier_id  INTEGER NOT NULL,
    client_id             INTEGER NOT NULL
);

ALTER TABLE sers ADD CONSTRAINT sers_pk PRIMARY KEY ( caissier_caissier_id,
                                                      client_id );

CREATE TABLE vend (
    caissier_caissier_id  INTEGER NOT NULL,
    billet_id             INTEGER NOT NULL
);

ALTER TABLE vend ADD CONSTRAINT vend_pk PRIMARY KEY ( caissier_caissier_id,
                                                      billet_id );

ALTER TABLE billet
    ADD CONSTRAINT billet_client_fk FOREIGN KEY ( client_id )
        REFERENCES client ( id );

ALTER TABLE billet
    ADD CONSTRAINT billet_film_fk FOREIGN KEY ( film_film_id )
        REFERENCES film ( film_id );

ALTER TABLE regarde
    ADD CONSTRAINT relation_14_client_fk FOREIGN KEY ( client_id )
        REFERENCES client ( id );

ALTER TABLE regarde
    ADD CONSTRAINT relation_14_film_fk FOREIGN KEY ( film_film_id )
        REFERENCES film ( film_id );

ALTER TABLE sers
    ADD CONSTRAINT sers_caissier_fk FOREIGN KEY ( caissier_caissier_id )
        REFERENCES caissier ( caissier_id );

ALTER TABLE sers
    ADD CONSTRAINT sers_client_fk FOREIGN KEY ( client_id )
        REFERENCES client ( id );

ALTER TABLE vend
    ADD CONSTRAINT vend_billet_fk FOREIGN KEY ( billet_id )
        REFERENCES billet ( id );

ALTER TABLE vend
    ADD CONSTRAINT vend_caissier_fk FOREIGN KEY ( caissier_caissier_id )
        REFERENCES caissier ( caissier_id );