# Meal-Tracker-Web-App

## Installation
Clone this repository and install all dependencies for the backend and frontend. Backend is with Maven (`mvn clean install`) and Frontend with NPM (`npm install`).

You also need to have docker installed.

## Start the Application
To start the application you can just type `$ make up`. This starts the docker compose, which contains of three container. One for the PostgreSQL Database, one for the Java Sprint Boot Backend and one for the Angular Frontend.
After the startup you can go to `http://localhost:4200/` and use the application.

### Start not via Make
If you wanna start the application without make, you can do this by use `$ docker-compose up --build` or if you just wanna run the frontend without backend and database you can do `$ cd meal-tracker-web-app | ng serve`.

## API

The API uses the PORT 8081:
- **GET** http://localhost:8081/meal - get all meals
- **POST** http://localhost:8081/meal - add a meal
- **DELETE** http://localhost:8081/meal/{id} - delete meal by id 

## Database
The database is locally, but all your data is saved to the `db/` directory and restart the database can use this data already.