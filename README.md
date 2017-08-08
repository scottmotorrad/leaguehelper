# leaguehelper
An app to help me play league more effectively through data from the Riot API and the magic of swagger UI

# How to run
##Prereqs

[Maven](https://maven.apache.org/download.cgi)

OpenJDK
[Windows](https://developers.redhat.com/products/openjdk/overview/) [nix](http://openjdk.java.net/)

##Steps
Set the LOL_HELPER_ACCOUNT_ID environment variable to the account you would like to analyze. This should be a 64 bit 
integer.

Set the RAPI_KEY environment variable to your RAPI API key ie RGAPI-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx

cd to .../leaguehelper/

mvn install

mvn spring-boot:run

Navigate to [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

If you are getting a null pointer exception make sure both environment variables are set to valid values.

# Current Features

## Duo Queue GG
Looks at all ranked game for the current season and give stats on who my teammates perform in games with me. 
Assigns a grade from "NORMS" for don't play ranked to "FLEX" for stick to flex to "SOLO" for teammates worth risking LP 
on.

### Current Implementation
1. Retrieves a list of all ranked games I've played for the season.
2. Gets the stats for my teammates in each game at a slow enough rate not to trigger RAPI rate limiting
3. Updates an in memory HashMap of all my teammates' stats
4. Exposes a single endpoint that returns the stat collection and the grade for any teammate I've played at least 3 
games with

Presently only uses in-memory storage. Next up is to persist the data somewhere else such as elasticache and to update 
the match list periodically instead of just on startup.

# Possible future features
1. AWS hosting (EC2 or ECS) 
2. Time of day analysis. Should I play ranked in the morning, evening, after lunch?
3. Combination of teammates for Flex queue
4. Position analysis for myselft and teammates
5. Trends on who is currently hot
6. Matchup analysis. Champion.gg is great for theoretical counters but what actually works for me.