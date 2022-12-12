CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS public."Users"
(
    user_id uuid NOT NULL DEFAULT uuid_generate_v4(),
    name character varying  NOT NULL,
    surname character varying  NOT NULL,
    mail character varying ,
    password character varying NOT NULL,
    tel_no character varying,
    role character varying,
    CONSTRAINT "Users_pkey" PRIMARY KEY (user_id)
    )
