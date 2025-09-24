#! /bin/bash

clear
docker build . -t postigs
docker run postgis
echo "done"