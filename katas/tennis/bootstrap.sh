#!/usr/bin/env bash

mvn clean package

docker build -t tennis-kata:latest .

docker-compose up -d