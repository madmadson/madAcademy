# madAcademy

## setup docker with docker

docker build -t my-postgres-db .

docker run -d --name my-postgresdb-container -p 5432:5432 my-postgres-db

## run mvn package

mvn clean package -Premote
