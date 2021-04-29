CREATE TABLE public.lab (
	lab_id int4 NOT NULL,
	"name" varchar NULL,
	CONSTRAINT lab_pk PRIMARY KEY (lab_id)
);

CREATE TABLE public.tribble (
	tribble_id int4 NOT NULL,
	"name" varchar NULL,
	CONSTRAINT tribble_pk PRIMARY KEY (tribble_id)
);

CREATE TABLE public.labs_tribbles (
	lab_id int4 NOT NULL,
	tribble_id int4 NOT NULL,
	CONSTRAINT labs_tribbles_un UNIQUE (tribble_id)
);

ALTER TABLE public.labs_tribbles ADD CONSTRAINT labs_tribbles_fk FOREIGN KEY (lab_id) REFERENCES public.lab(lab_id) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE public.labs_tribbles ADD CONSTRAINT labs_tribbles_fk_1 FOREIGN KEY (tribble_id) REFERENCES public.tribble(tribble_id) ON DELETE CASCADE ON UPDATE CASCADE;