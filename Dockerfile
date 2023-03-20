FROM postgres
ENV POSTGRES_PASSWORD docker
ENV POSTGRES_DB world
COPY article.sql /docker-entrypoint-initdb.d/