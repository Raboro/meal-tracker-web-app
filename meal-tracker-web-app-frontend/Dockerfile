# Stage 1: Build Angular application
FROM node:20-alpine as build

WORKDIR /app

COPY package*.json ./

RUN npm install -g @angular/cli 
RUN npm ci

COPY . .
CMD [ "ng", "serve", "--host", "0.0.0.0" ]
