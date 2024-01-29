# grupal
Proceso ETL en lenguaje java que vuelca todo el contenido del esquema relacional
de las estaciones de servicio en el motor de búsqueda ElasticSearch.

Adjunto volcado de la base de datos en el fichero *eess-dump.sql*

Para cargar la base de datos en el mysql en docker:
```
docker cp eess-dump.sql bbdda-mysql:/
docker exec -it bbdda-mysql bash
mysql -u root -p < eess-dump.sql
```
