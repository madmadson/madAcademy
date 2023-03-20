-- Table: public.article
-- DROP TABLE IF EXISTS public.article;
BEGIN;
SET client_encoding = 'LATIN1';
CREATE TABLE IF NOT EXISTS public.article (id bigint, article_name text) TABLESPACE pg_default;
ALTER TABLE IF EXISTS public.article OWNER to postgres;
INSERT INTO public.article(id, article_name)
VALUES (1, 'TestData');
INSERT INTO public.article(id, article_name)
VALUES (2, 'TestData');
COMMIT;