CREATE TABLE IF NOT EXISTS public."Users"
(
    user_id uuid NOT NULL,
    name character varying COLLATE pg_catalog."default" NOT NULL,
    surname character varying COLLATE pg_catalog."default" NOT NULL,
    mail character varying COLLATE pg_catalog."default",
    password character varying COLLATE pg_catalog."default" NOT NULL,
    tel_no character varying COLLATE pg_catalog."default",
    role character varying COLLATE pg_catalog."default",
    CONSTRAINT "Users_pkey" PRIMARY KEY (user_id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."Users"
    OWNER to postgres;