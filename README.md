# MatchController API

This Spring Boot application includes an API for managing match statistics.

## Endpoint

- **POST /createMatch**
  - Creates a new match with team statistics.
  - Request Body: MatchRequest object containing match details and team statistics.
  - Response: Success message or error message.

- **GET /getMatchStats/{matchId}**
  - Retrieves the statistics for a specific match by its ID.
  - Path Variable: matchId (unique identifier for the match).
  - Response: Match object with statistics or not found message.

- **GET /getAllMatches**
  - Retrieves the statistics for all matches.
  - Response: List of Match objects with statistics.

## Usage

1. **Create a Match**
   - Send a POST request to `/createMatch` with a JSON payload containing the match details and team statistics in the following format:
     ```json
     {
         "matchId": "1",
         "date": "2024-04-05",
         "stats": {
             "teamA": {
                 "goals": "2",
                 "possession": "60%",
                 "passes": "300",
                 "shots": "10",
                 "shotsOnTarget": "5",
                 "corners": "3"
             },
             "teamB": {
                 "goals": "1",
                 "possession": "40%",
                 "passes": "250",
                 "shots": "8",
                 "shotsOnTarget": "3",
                 "corners": "2"
             }
         }
     }
     ```
   - Example Response:
     - Status: 201 Created
     - Body: Match created successfully

2. **Get Match Statistics**
   - Send a GET request to `/getMatchStats/{matchId}` to retrieve the statistics for a specific match.
   - Example Response:
     - Status: 200 OK
     - Body: Match object with statistics

3. **Get All Match Statistics**
   - Send a GET request to `/getAllMatches` to retrieve the statistics for all matches.
   - Example Response:
     - Status: 200 OK
     - Body: List of Match objects with statistics

## Setup

1. Clone the repository.
2. Build and run the Spring Boot application.
3. Use tools like Postman to test the API endpoints.








![image](https://github.com/Akshitha2106/flick-match-assignment-modified/assets/101176297/220d4726-a3c7-4ea4-acc7-dc15a61fe962)
![image](https://github.com/Akshitha2106/flick-match-assignment-modified/assets/101176297/7c63c598-7f83-4528-a8bb-df1209d9c948)
![image](https://github.com/Akshitha2106/flick-match-assignment-modified/assets/101176297/d4b8d35b-573e-43ac-bd32-42cfdfc3dc65)



