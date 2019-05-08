docker build -t ricardojob/bd ./postgres
docker run -p 5433:5432 --name bd -d ricardojob/bd 

cd app && mvn clean package && cd ..
docker build -t ricardojob/app ./app
docker run -p 8080:8080 --name app -d --link bd:host-banco ricardojob/app
# echo 'fim'
