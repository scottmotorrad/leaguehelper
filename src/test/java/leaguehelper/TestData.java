package leaguehelper;

// Holds sample JSON response from the Riot API
public class TestData {
    private TestData() {
        //static test data provider
    }

    public static final String playerJson = "{\n" +
            "                \"currentPlatformId\": \"NA1\",\n" +
            "                \"summonerName\": \"MrPantsOptional\",\n" +
            "                \"matchHistoryUri\": \"/v1/stats/player_history/NA/37455819\",\n" +
            "                \"platformId\": \"NA\",\n" +
            "                \"currentAccountId\": 37455819,\n" +
            "                \"profileIcon\": 748,\n" +
            "                \"summonerId\": 43767363,\n" +
            "                \"accountId\": 37455819\n" +
            "            }";

    public static final String participantStatsJson = "{\n" +
            "                \"item1\": 3071,\n" +
            "                \"totalPlayerScore\": 0,\n" +
            "                \"visionScore\": 0,\n" +
            "                \"unrealKills\": 0,\n" +
            "                \"win\": true,\n" +
            "                \"objectivePlayerScore\": 0,\n" +
            "                \"largestCriticalStrike\": 0,\n" +
            "                \"totalDamageDealt\": 82923,\n" +
            "                \"magicDamageDealtToChampions\": 1714,\n" +
            "                \"largestMultiKill\": 1,\n" +
            "                \"largestKillingSpree\": 3,\n" +
            "                \"quadraKills\": 0,\n" +
            "                \"totalTimeCrowdControlDealt\": 97,\n" +
            "                \"magicalDamageTaken\": 3325,\n" +
            "                \"longestTimeSpentLiving\": 728,\n" +
            "                \"neutralMinionsKilledEnemyJungle\": 1,\n" +
            "                \"firstTowerAssist\": true,\n" +
            "                \"neutralMinionsKilledTeamJungle\": 0,\n" +
            "                \"goldEarned\": 8819,\n" +
            "                \"item2\": 3047,\n" +
            "                \"item3\": 3076,\n" +
            "                \"item0\": 1054,\n" +
            "                \"deaths\": 2,\n" +
            "                \"item6\": 3348,\n" +
            "                \"item4\": 3082,\n" +
            "                \"item5\": 1028,\n" +
            "                \"turretKills\": 1,\n" +
            "                \"tripleKills\": 0,\n" +
            "                \"damageSelfMitigated\": 18858,\n" +
            "                \"goldSpent\": 7050,\n" +
            "                \"magicDamageDealt\": 3799,\n" +
            "                \"kills\": 3,\n" +
            "                \"doubleKills\": 0,\n" +
            "                \"firstInhibitorKill\": false,\n" +
            "                \"trueDamageTaken\": 400,\n" +
            "                \"firstBloodAssist\": false,\n" +
            "                \"firstBloodKill\": false,\n" +
            "                \"assists\": 6,\n" +
            "                \"totalScoreRank\": 0,\n" +
            "                \"neutralMinionsKilled\": 1,\n" +
            "                \"combatPlayerScore\": 0,\n" +
            "                \"visionWardsBoughtInGame\": 0,\n" +
            "                \"damageDealtToTurrets\": 2755,\n" +
            "                \"physicalDamageDealtToChampions\": 10500,\n" +
            "                \"pentaKills\": 0,\n" +
            "                \"trueDamageDealt\": 1064,\n" +
            "                \"trueDamageDealtToChampions\": 1064,\n" +
            "                \"champLevel\": 13,\n" +
            "                \"participantId\": 4,\n" +
            "                \"firstInhibitorAssist\": false,\n" +
            "                \"firstTowerKill\": false,\n" +
            "                \"totalHeal\": 1317,\n" +
            "                \"totalMinionsKilled\": 145,\n" +
            "                \"physicalDamageDealt\": 78058,\n" +
            "                \"damageDealtToObjectives\": 5186,\n" +
            "                \"sightWardsBoughtInGame\": 0,\n" +
            "                \"totalDamageDealtToChampions\": 13280,\n" +
            "                \"totalUnitsHealed\": 1,\n" +
            "                \"inhibitorKills\": 0,\n" +
            "                \"totalDamageTaken\": 15784,\n" +
            "                \"killingSprees\": 1,\n" +
            "                \"timeCCingOthers\": 36,\n" +
            "                \"physicalDamageTaken\": 12059\n" +
            "            }";

    public static final String matchDataJson = "{\n" +
            "    \"seasonId\": 9,\n" +
            "    \"queueId\": 9,\n" +
            "    \"gameId\": 2562814789,\n" +
            "    \"participantIdentities\": [\n" +
            "        {\n" +
            "            \"player\": {\n" +
            "                \"currentPlatformId\": \"NA1\",\n" +
            "                \"summonerName\": \"RatchetRain\",\n" +
            "                \"matchHistoryUri\": \"/v1/stats/player_history/NA1/201618304\",\n" +
            "                \"platformId\": \"NA1\",\n" +
            "                \"currentAccountId\": 201618304,\n" +
            "                \"profileIcon\": 604,\n" +
            "                \"summonerId\": 38910159,\n" +
            "                \"accountId\": 201618304\n" +
            "            },\n" +
            "            \"participantId\": 1\n" +
            "        },\n" +
            "        {\n" +
            "            \"player\": {\n" +
            "                \"currentPlatformId\": \"NA1\",\n" +
            "                \"summonerName\": \"InvalidSniper\",\n" +
            "                \"matchHistoryUri\": \"/v1/stats/player_history/NA1/207389838\",\n" +
            "                \"platformId\": \"NA1\",\n" +
            "                \"currentAccountId\": 207389838,\n" +
            "                \"profileIcon\": 581,\n" +
            "                \"summonerId\": 44651738,\n" +
            "                \"accountId\": 207389838\n" +
            "            },\n" +
            "            \"participantId\": 2\n" +
            "        },\n" +
            "        {\n" +
            "            \"player\": {\n" +
            "                \"currentPlatformId\": \"NA1\",\n" +
            "                \"summonerName\": \"RatchetSniper\",\n" +
            "                \"matchHistoryUri\": \"/v1/stats/player_history/NA1/201618408\",\n" +
            "                \"platformId\": \"NA1\",\n" +
            "                \"currentAccountId\": 201618408,\n" +
            "                \"profileIcon\": 1426,\n" +
            "                \"summonerId\": 38781094,\n" +
            "                \"accountId\": 201618408\n" +
            "            },\n" +
            "            \"participantId\": 3\n" +
            "        },\n" +
            "        {\n" +
            "            \"player\": {\n" +
            "                \"currentPlatformId\": \"NA1\",\n" +
            "                \"summonerName\": \"MrPantsOptional\",\n" +
            "                \"matchHistoryUri\": \"/v1/stats/player_history/NA/37455819\",\n" +
            "                \"platformId\": \"NA\",\n" +
            "                \"currentAccountId\": 37455819,\n" +
            "                \"profileIcon\": 748,\n" +
            "                \"summonerId\": 43767363,\n" +
            "                \"accountId\": 37455819\n" +
            "            },\n" +
            "            \"participantId\": 4\n" +
            "        },\n" +
            "        {\n" +
            "            \"player\": {\n" +
            "                \"currentPlatformId\": \"NA1\",\n" +
            "                \"summonerName\": \"LAXNover\",\n" +
            "                \"matchHistoryUri\": \"/v1/stats/player_history/NA/37258869\",\n" +
            "                \"platformId\": \"NA\",\n" +
            "                \"currentAccountId\": 37258869,\n" +
            "                \"profileIcon\": 897,\n" +
            "                \"summonerId\": 23228734,\n" +
            "                \"accountId\": 37258869\n" +
            "            },\n" +
            "            \"participantId\": 5\n" +
            "        },\n" +
            "        {\n" +
            "            \"player\": {\n" +
            "                \"currentPlatformId\": \"NA1\",\n" +
            "                \"summonerName\": \"Nixinox\",\n" +
            "                \"matchHistoryUri\": \"/v1/stats/player_history/NA/38038469\",\n" +
            "                \"platformId\": \"NA\",\n" +
            "                \"currentAccountId\": 38038469,\n" +
            "                \"profileIcon\": 1110,\n" +
            "                \"summonerId\": 23848582,\n" +
            "                \"accountId\": 38038469\n" +
            "            },\n" +
            "            \"participantId\": 6\n" +
            "        }\n" +
            "    ],\n" +
            "    \"gameVersion\": \"7.15.196.5272\",\n" +
            "    \"platformId\": \"NA1\",\n" +
            "    \"gameMode\": \"CLASSIC\",\n" +
            "    \"mapId\": 10,\n" +
            "    \"gameType\": \"MATCHED_GAME\",\n" +
            "    \"teams\": [\n" +
            "        {\n" +
            "            \"firstDragon\": false,\n" +
            "            \"bans\": [\n" +
            "                {\n" +
            "                    \"pickTurn\": 1,\n" +
            "                    \"championId\": 122\n" +
            "                },\n" +
            "                {\n" +
            "                    \"pickTurn\": 3,\n" +
            "                    \"championId\": 420\n" +
            "                },\n" +
            "                {\n" +
            "                    \"pickTurn\": 5,\n" +
            "                    \"championId\": 154\n" +
            "                }\n" +
            "            ],\n" +
            "            \"firstInhibitor\": false,\n" +
            "            \"win\": \"Fail\",\n" +
            "            \"firstRiftHerald\": false,\n" +
            "            \"firstBaron\": false,\n" +
            "            \"baronKills\": 0,\n" +
            "            \"riftHeraldKills\": 0,\n" +
            "            \"firstBlood\": false,\n" +
            "            \"teamId\": 100,\n" +
            "            \"firstTower\": false,\n" +
            "            \"vilemawKills\": 0,\n" +
            "            \"inhibitorKills\": 0,\n" +
            "            \"towerKills\": 1,\n" +
            "            \"dominionVictoryScore\": 0,\n" +
            "            \"dragonKills\": 0\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstDragon\": false,\n" +
            "            \"bans\": [\n" +
            "                {\n" +
            "                    \"pickTurn\": 2,\n" +
            "                    \"championId\": 34\n" +
            "                },\n" +
            "                {\n" +
            "                    \"pickTurn\": 4,\n" +
            "                    \"championId\": 31\n" +
            "                },\n" +
            "                {\n" +
            "                    \"pickTurn\": 6,\n" +
            "                    \"championId\": 90\n" +
            "                }\n" +
            "            ],\n" +
            "            \"firstInhibitor\": true,\n" +
            "            \"win\": \"Win\",\n" +
            "            \"firstRiftHerald\": false,\n" +
            "            \"firstBaron\": false,\n" +
            "            \"baronKills\": 0,\n" +
            "            \"riftHeraldKills\": 0,\n" +
            "            \"firstBlood\": true,\n" +
            "            \"teamId\": 200,\n" +
            "            \"firstTower\": true,\n" +
            "            \"vilemawKills\": 1,\n" +
            "            \"inhibitorKills\": 1,\n" +
            "            \"towerKills\": 6,\n" +
            "            \"dominionVictoryScore\": 0,\n" +
            "            \"dragonKills\": 0\n" +
            "        }\n" +
            "    ],\n" +
            "    \"participants\": [\n" +
            "        {\n" +
            "            \"stats\": {\n" +
            "                \"item1\": 3078,\n" +
            "                \"totalPlayerScore\": 0,\n" +
            "                \"visionScore\": 0,\n" +
            "                \"unrealKills\": 0,\n" +
            "                \"win\": false,\n" +
            "                \"objectivePlayerScore\": 0,\n" +
            "                \"largestCriticalStrike\": 0,\n" +
            "                \"totalDamageDealt\": 102833,\n" +
            "                \"magicDamageDealtToChampions\": 1330,\n" +
            "                \"largestMultiKill\": 3,\n" +
            "                \"largestKillingSpree\": 4,\n" +
            "                \"quadraKills\": 0,\n" +
            "                \"totalTimeCrowdControlDealt\": 61,\n" +
            "                \"magicalDamageTaken\": 3926,\n" +
            "                \"longestTimeSpentLiving\": 1131,\n" +
            "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
            "                \"firstTowerAssist\": false,\n" +
            "                \"neutralMinionsKilledTeamJungle\": 80,\n" +
            "                \"goldEarned\": 8240,\n" +
            "                \"item2\": 2031,\n" +
            "                \"item3\": 3047,\n" +
            "                \"item0\": 1412,\n" +
            "                \"deaths\": 2,\n" +
            "                \"item6\": 3348,\n" +
            "                \"item4\": 1036,\n" +
            "                \"item5\": 0,\n" +
            "                \"turretKills\": 1,\n" +
            "                \"tripleKills\": 1,\n" +
            "                \"damageSelfMitigated\": 14251,\n" +
            "                \"goldSpent\": 7958,\n" +
            "                \"magicDamageDealt\": 20532,\n" +
            "                \"kills\": 4,\n" +
            "                \"doubleKills\": 1,\n" +
            "                \"firstInhibitorKill\": false,\n" +
            "                \"trueDamageTaken\": 1156,\n" +
            "                \"firstBloodAssist\": false,\n" +
            "                \"firstBloodKill\": false,\n" +
            "                \"assists\": 0,\n" +
            "                \"totalScoreRank\": 0,\n" +
            "                \"neutralMinionsKilled\": 80,\n" +
            "                \"combatPlayerScore\": 0,\n" +
            "                \"visionWardsBoughtInGame\": 0,\n" +
            "                \"damageDealtToTurrets\": 548,\n" +
            "                \"physicalDamageDealtToChampions\": 5215,\n" +
            "                \"pentaKills\": 0,\n" +
            "                \"trueDamageDealt\": 6724,\n" +
            "                \"trueDamageDealtToChampions\": 234,\n" +
            "                \"champLevel\": 13,\n" +
            "                \"participantId\": 1,\n" +
            "                \"firstInhibitorAssist\": false,\n" +
            "                \"firstTowerKill\": false,\n" +
            "                \"totalHeal\": 8011,\n" +
            "                \"totalMinionsKilled\": 28,\n" +
            "                \"physicalDamageDealt\": 75578,\n" +
            "                \"damageDealtToObjectives\": 548,\n" +
            "                \"sightWardsBoughtInGame\": 0,\n" +
            "                \"totalDamageDealtToChampions\": 6779,\n" +
            "                \"totalUnitsHealed\": 1,\n" +
            "                \"inhibitorKills\": 0,\n" +
            "                \"totalDamageTaken\": 18985,\n" +
            "                \"killingSprees\": 1,\n" +
            "                \"timeCCingOthers\": 11,\n" +
            "                \"physicalDamageTaken\": 13902\n" +
            "            },\n" +
            "            \"spell1Id\": 11,\n" +
            "            \"participantId\": 1,\n" +
            "            \"runes\": [\n" +
            "                {\n" +
            "                    \"runeId\": 5245,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5290,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5317,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5345,\n" +
            "                    \"rank\": 3\n" +
            "                }\n" +
            "            ],\n" +
            "            \"highestAchievedSeasonTier\": \"UNRANKED\",\n" +
            "            \"masteries\": [\n" +
            "                {\n" +
            "                    \"masteryId\": 6111,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6122,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6131,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6141,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6151,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6162,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6212,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6223,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6232,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6243,\n" +
            "                    \"rank\": 1\n" +
            "                }\n" +
            "            ],\n" +
            "            \"spell2Id\": 4,\n" +
            "            \"teamId\": 100,\n" +
            "            \"timeline\": {\n" +
            "                \"lane\": \"JUNGLE\",\n" +
            "                \"participantId\": 1,\n" +
            "                \"goldPerMinDeltas\": {\n" +
            "                    \"0-10\": 357.7,\n" +
            "                    \"10-20\": 318.9\n" +
            "                },\n" +
            "                \"creepsPerMinDeltas\": {\n" +
            "                    \"0-10\": 1.3,\n" +
            "                    \"10-20\": 1\n" +
            "                },\n" +
            "                \"xpPerMinDeltas\": {\n" +
            "                    \"0-10\": 457.6,\n" +
            "                    \"10-20\": 489.4\n" +
            "                },\n" +
            "                \"role\": \"NONE\",\n" +
            "                \"damageTakenPerMinDeltas\": {\n" +
            "                    \"0-10\": 652.9,\n" +
            "                    \"10-20\": 917.9000000000001\n" +
            "                }\n" +
            "            },\n" +
            "            \"championId\": 24\n" +
            "        },\n" +
            "        {\n" +
            "            \"stats\": {\n" +
            "                \"item1\": 3071,\n" +
            "                \"totalPlayerScore\": 0,\n" +
            "                \"visionScore\": 0,\n" +
            "                \"unrealKills\": 0,\n" +
            "                \"win\": false,\n" +
            "                \"objectivePlayerScore\": 0,\n" +
            "                \"largestCriticalStrike\": 0,\n" +
            "                \"totalDamageDealt\": 44571,\n" +
            "                \"magicDamageDealtToChampions\": 129,\n" +
            "                \"largestMultiKill\": 0,\n" +
            "                \"largestKillingSpree\": 0,\n" +
            "                \"quadraKills\": 0,\n" +
            "                \"totalTimeCrowdControlDealt\": 20,\n" +
            "                \"magicalDamageTaken\": 5619,\n" +
            "                \"longestTimeSpentLiving\": 512,\n" +
            "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
            "                \"firstTowerAssist\": false,\n" +
            "                \"neutralMinionsKilledTeamJungle\": 0,\n" +
            "                \"goldEarned\": 5405,\n" +
            "                \"item2\": 2003,\n" +
            "                \"item3\": 3111,\n" +
            "                \"item0\": 3082,\n" +
            "                \"deaths\": 6,\n" +
            "                \"item6\": 3348,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 0,\n" +
            "                \"turretKills\": 0,\n" +
            "                \"tripleKills\": 0,\n" +
            "                \"damageSelfMitigated\": 10359,\n" +
            "                \"goldSpent\": 5200,\n" +
            "                \"magicDamageDealt\": 129,\n" +
            "                \"kills\": 0,\n" +
            "                \"doubleKills\": 0,\n" +
            "                \"firstInhibitorKill\": false,\n" +
            "                \"trueDamageTaken\": 300,\n" +
            "                \"firstBloodAssist\": false,\n" +
            "                \"firstBloodKill\": false,\n" +
            "                \"assists\": 1,\n" +
            "                \"totalScoreRank\": 0,\n" +
            "                \"neutralMinionsKilled\": 0,\n" +
            "                \"combatPlayerScore\": 0,\n" +
            "                \"visionWardsBoughtInGame\": 0,\n" +
            "                \"damageDealtToTurrets\": 223,\n" +
            "                \"physicalDamageDealtToChampions\": 2889,\n" +
            "                \"pentaKills\": 0,\n" +
            "                \"trueDamageDealt\": 280,\n" +
            "                \"trueDamageDealtToChampions\": 280,\n" +
            "                \"champLevel\": 11,\n" +
            "                \"participantId\": 2,\n" +
            "                \"firstInhibitorAssist\": false,\n" +
            "                \"firstTowerKill\": false,\n" +
            "                \"totalHeal\": 853,\n" +
            "                \"totalMinionsKilled\": 90,\n" +
            "                \"physicalDamageDealt\": 44162,\n" +
            "                \"damageDealtToObjectives\": 223,\n" +
            "                \"sightWardsBoughtInGame\": 0,\n" +
            "                \"totalDamageDealtToChampions\": 3299,\n" +
            "                \"totalUnitsHealed\": 1,\n" +
            "                \"inhibitorKills\": 0,\n" +
            "                \"totalDamageTaken\": 16619,\n" +
            "                \"killingSprees\": 0,\n" +
            "                \"timeCCingOthers\": 2,\n" +
            "                \"physicalDamageTaken\": 10699\n" +
            "            },\n" +
            "            \"spell1Id\": 14,\n" +
            "            \"participantId\": 2,\n" +
            "            \"runes\": [\n" +
            "                {\n" +
            "                    \"runeId\": 5123,\n" +
            "                    \"rank\": 2\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5245,\n" +
            "                    \"rank\": 7\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5289,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5290,\n" +
            "                    \"rank\": 4\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5317,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5335,\n" +
            "                    \"rank\": 3\n" +
            "                }\n" +
            "            ],\n" +
            "            \"highestAchievedSeasonTier\": \"UNRANKED\",\n" +
            "            \"masteries\": [\n" +
            "                {\n" +
            "                    \"masteryId\": 6114,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6122,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6131,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6143,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6211,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6223,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6231,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6241,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6251,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6261,\n" +
            "                    \"rank\": 1\n" +
            "                }\n" +
            "            ],\n" +
            "            \"spell2Id\": 4,\n" +
            "            \"teamId\": 100,\n" +
            "            \"timeline\": {\n" +
            "                \"lane\": \"MIDDLE\",\n" +
            "                \"participantId\": 2,\n" +
            "                \"goldPerMinDeltas\": {\n" +
            "                    \"0-10\": 182.2,\n" +
            "                    \"10-20\": 220.5\n" +
            "                },\n" +
            "                \"creepsPerMinDeltas\": {\n" +
            "                    \"0-10\": 3.6,\n" +
            "                    \"10-20\": 4.2\n" +
            "                },\n" +
            "                \"xpPerMinDeltas\": {\n" +
            "                    \"0-10\": 383.90000000000003,\n" +
            "                    \"10-20\": 331.6\n" +
            "                },\n" +
            "                \"role\": \"DUO\",\n" +
            "                \"damageTakenPerMinDeltas\": {\n" +
            "                    \"0-10\": 446,\n" +
            "                    \"10-20\": 916.5999999999999\n" +
            "                }\n" +
            "            },\n" +
            "            \"championId\": 240\n" +
            "        },\n" +
            "        {\n" +
            "            \"stats\": {\n" +
            "                \"item1\": 3165,\n" +
            "                \"totalPlayerScore\": 0,\n" +
            "                \"visionScore\": 0,\n" +
            "                \"unrealKills\": 0,\n" +
            "                \"win\": false,\n" +
            "                \"objectivePlayerScore\": 0,\n" +
            "                \"largestCriticalStrike\": 0,\n" +
            "                \"totalDamageDealt\": 72632,\n" +
            "                \"magicDamageDealtToChampions\": 10582,\n" +
            "                \"largestMultiKill\": 1,\n" +
            "                \"largestKillingSpree\": 0,\n" +
            "                \"quadraKills\": 0,\n" +
            "                \"totalTimeCrowdControlDealt\": 217,\n" +
            "                \"magicalDamageTaken\": 4849,\n" +
            "                \"longestTimeSpentLiving\": 909,\n" +
            "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
            "                \"firstTowerAssist\": false,\n" +
            "                \"neutralMinionsKilledTeamJungle\": 0,\n" +
            "                \"goldEarned\": 6774,\n" +
            "                \"item2\": 1056,\n" +
            "                \"item3\": 1056,\n" +
            "                \"item0\": 3020,\n" +
            "                \"deaths\": 2,\n" +
            "                \"item6\": 3348,\n" +
            "                \"item4\": 3191,\n" +
            "                \"item5\": 0,\n" +
            "                \"turretKills\": 0,\n" +
            "                \"tripleKills\": 0,\n" +
            "                \"damageSelfMitigated\": 2603,\n" +
            "                \"goldSpent\": 6150,\n" +
            "                \"magicDamageDealt\": 63792,\n" +
            "                \"kills\": 1,\n" +
            "                \"doubleKills\": 0,\n" +
            "                \"firstInhibitorKill\": false,\n" +
            "                \"trueDamageTaken\": 176,\n" +
            "                \"firstBloodAssist\": false,\n" +
            "                \"firstBloodKill\": false,\n" +
            "                \"assists\": 4,\n" +
            "                \"totalScoreRank\": 0,\n" +
            "                \"neutralMinionsKilled\": 0,\n" +
            "                \"combatPlayerScore\": 0,\n" +
            "                \"visionWardsBoughtInGame\": 0,\n" +
            "                \"damageDealtToTurrets\": 150,\n" +
            "                \"physicalDamageDealtToChampions\": 1122,\n" +
            "                \"pentaKills\": 0,\n" +
            "                \"trueDamageDealt\": 530,\n" +
            "                \"trueDamageDealtToChampions\": 530,\n" +
            "                \"champLevel\": 12,\n" +
            "                \"participantId\": 3,\n" +
            "                \"firstInhibitorAssist\": false,\n" +
            "                \"firstTowerKill\": false,\n" +
            "                \"totalHeal\": 291,\n" +
            "                \"totalMinionsKilled\": 123,\n" +
            "                \"physicalDamageDealt\": 8309,\n" +
            "                \"damageDealtToObjectives\": 150,\n" +
            "                \"sightWardsBoughtInGame\": 0,\n" +
            "                \"totalDamageDealtToChampions\": 12234,\n" +
            "                \"totalUnitsHealed\": 1,\n" +
            "                \"inhibitorKills\": 0,\n" +
            "                \"totalDamageTaken\": 8476,\n" +
            "                \"killingSprees\": 0,\n" +
            "                \"timeCCingOthers\": 26,\n" +
            "                \"physicalDamageTaken\": 3451\n" +
            "            },\n" +
            "            \"spell1Id\": 4,\n" +
            "            \"participantId\": 3,\n" +
            "            \"runes\": [\n" +
            "                {\n" +
            "                    \"runeId\": 5273,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5297,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5331,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5357,\n" +
            "                    \"rank\": 3\n" +
            "                }\n" +
            "            ],\n" +
            "            \"highestAchievedSeasonTier\": \"UNRANKED\",\n" +
            "            \"masteries\": [\n" +
            "                {\n" +
            "                    \"masteryId\": 6114,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6121,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6134,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6142,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6312,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6322,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6332,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6343,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6352,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6361,\n" +
            "                    \"rank\": 1\n" +
            "                }\n" +
            "            ],\n" +
            "            \"spell2Id\": 14,\n" +
            "            \"teamId\": 100,\n" +
            "            \"timeline\": {\n" +
            "                \"lane\": \"MIDDLE\",\n" +
            "                \"participantId\": 3,\n" +
            "                \"goldPerMinDeltas\": {\n" +
            "                    \"0-10\": 238.4,\n" +
            "                    \"10-20\": 304\n" +
            "                },\n" +
            "                \"creepsPerMinDeltas\": {\n" +
            "                    \"0-10\": 5,\n" +
            "                    \"10-20\": 6.3\n" +
            "                },\n" +
            "                \"xpPerMinDeltas\": {\n" +
            "                    \"0-10\": 444.40000000000003,\n" +
            "                    \"10-20\": 473.5\n" +
            "                },\n" +
            "                \"role\": \"DUO\",\n" +
            "                \"damageTakenPerMinDeltas\": {\n" +
            "                    \"0-10\": 280.4,\n" +
            "                    \"10-20\": 398.3\n" +
            "                }\n" +
            "            },\n" +
            "            \"championId\": 134\n" +
            "        },\n" +
            "        {\n" +
            "            \"stats\": {\n" +
            "                \"item1\": 3071,\n" +
            "                \"totalPlayerScore\": 0,\n" +
            "                \"visionScore\": 0,\n" +
            "                \"unrealKills\": 0,\n" +
            "                \"win\": true,\n" +
            "                \"objectivePlayerScore\": 0,\n" +
            "                \"largestCriticalStrike\": 0,\n" +
            "                \"totalDamageDealt\": 82923,\n" +
            "                \"magicDamageDealtToChampions\": 1714,\n" +
            "                \"largestMultiKill\": 1,\n" +
            "                \"largestKillingSpree\": 3,\n" +
            "                \"quadraKills\": 0,\n" +
            "                \"totalTimeCrowdControlDealt\": 97,\n" +
            "                \"magicalDamageTaken\": 3325,\n" +
            "                \"longestTimeSpentLiving\": 728,\n" +
            "                \"neutralMinionsKilledEnemyJungle\": 1,\n" +
            "                \"firstTowerAssist\": true,\n" +
            "                \"neutralMinionsKilledTeamJungle\": 0,\n" +
            "                \"goldEarned\": 8819,\n" +
            "                \"item2\": 3047,\n" +
            "                \"item3\": 3076,\n" +
            "                \"item0\": 1054,\n" +
            "                \"deaths\": 2,\n" +
            "                \"item6\": 3348,\n" +
            "                \"item4\": 3082,\n" +
            "                \"item5\": 1028,\n" +
            "                \"turretKills\": 1,\n" +
            "                \"tripleKills\": 0,\n" +
            "                \"damageSelfMitigated\": 18858,\n" +
            "                \"goldSpent\": 7050,\n" +
            "                \"magicDamageDealt\": 3799,\n" +
            "                \"kills\": 3,\n" +
            "                \"doubleKills\": 0,\n" +
            "                \"firstInhibitorKill\": false,\n" +
            "                \"trueDamageTaken\": 400,\n" +
            "                \"firstBloodAssist\": false,\n" +
            "                \"firstBloodKill\": false,\n" +
            "                \"assists\": 6,\n" +
            "                \"totalScoreRank\": 0,\n" +
            "                \"neutralMinionsKilled\": 1,\n" +
            "                \"combatPlayerScore\": 0,\n" +
            "                \"visionWardsBoughtInGame\": 0,\n" +
            "                \"damageDealtToTurrets\": 2755,\n" +
            "                \"physicalDamageDealtToChampions\": 10500,\n" +
            "                \"pentaKills\": 0,\n" +
            "                \"trueDamageDealt\": 1064,\n" +
            "                \"trueDamageDealtToChampions\": 1064,\n" +
            "                \"champLevel\": 13,\n" +
            "                \"participantId\": 4,\n" +
            "                \"firstInhibitorAssist\": false,\n" +
            "                \"firstTowerKill\": false,\n" +
            "                \"totalHeal\": 1317,\n" +
            "                \"totalMinionsKilled\": 145,\n" +
            "                \"physicalDamageDealt\": 78058,\n" +
            "                \"damageDealtToObjectives\": 5186,\n" +
            "                \"sightWardsBoughtInGame\": 0,\n" +
            "                \"totalDamageDealtToChampions\": 13280,\n" +
            "                \"totalUnitsHealed\": 1,\n" +
            "                \"inhibitorKills\": 0,\n" +
            "                \"totalDamageTaken\": 15784,\n" +
            "                \"killingSprees\": 1,\n" +
            "                \"timeCCingOthers\": 36,\n" +
            "                \"physicalDamageTaken\": 12059\n" +
            "            },\n" +
            "            \"spell1Id\": 3,\n" +
            "            \"participantId\": 4,\n" +
            "            \"runes\": [\n" +
            "                {\n" +
            "                    \"runeId\": 5245,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5289,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5317,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5337,\n" +
            "                    \"rank\": 3\n" +
            "                }\n" +
            "            ],\n" +
            "            \"highestAchievedSeasonTier\": \"UNRANKED\",\n" +
            "            \"masteries\": [\n" +
            "                {\n" +
            "                    \"masteryId\": 6114,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6121,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6131,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6143,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6212,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6223,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6231,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6241,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6251,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6261,\n" +
            "                    \"rank\": 1\n" +
            "                }\n" +
            "            ],\n" +
            "            \"spell2Id\": 4,\n" +
            "            \"teamId\": 200,\n" +
            "            \"timeline\": {\n" +
            "                \"lane\": \"MIDDLE\",\n" +
            "                \"participantId\": 4,\n" +
            "                \"goldPerMinDeltas\": {\n" +
            "                    \"0-10\": 265.4,\n" +
            "                    \"10-20\": 374.4\n" +
            "                },\n" +
            "                \"creepsPerMinDeltas\": {\n" +
            "                    \"0-10\": 6.4,\n" +
            "                    \"10-20\": 5.6\n" +
            "                },\n" +
            "                \"xpPerMinDeltas\": {\n" +
            "                    \"0-10\": 430.9,\n" +
            "                    \"10-20\": 520.4\n" +
            "                },\n" +
            "                \"role\": \"SOLO\",\n" +
            "                \"damageTakenPerMinDeltas\": {\n" +
            "                    \"0-10\": 456.5,\n" +
            "                    \"10-20\": 768.6\n" +
            "                }\n" +
            "            },\n" +
            "            \"championId\": 86\n" +
            "        },\n" +
            "        {\n" +
            "            \"stats\": {\n" +
            "                \"item1\": 3117,\n" +
            "                \"totalPlayerScore\": 0,\n" +
            "                \"visionScore\": 0,\n" +
            "                \"unrealKills\": 0,\n" +
            "                \"win\": true,\n" +
            "                \"objectivePlayerScore\": 0,\n" +
            "                \"largestCriticalStrike\": 0,\n" +
            "                \"totalDamageDealt\": 86402,\n" +
            "                \"magicDamageDealtToChampions\": 8326,\n" +
            "                \"largestMultiKill\": 1,\n" +
            "                \"largestKillingSpree\": 2,\n" +
            "                \"quadraKills\": 0,\n" +
            "                \"totalTimeCrowdControlDealt\": 316,\n" +
            "                \"magicalDamageTaken\": 2378,\n" +
            "                \"longestTimeSpentLiving\": 508,\n" +
            "                \"neutralMinionsKilledEnemyJungle\": 1,\n" +
            "                \"firstTowerAssist\": false,\n" +
            "                \"neutralMinionsKilledTeamJungle\": 55,\n" +
            "                \"goldEarned\": 8558,\n" +
            "                \"item2\": 3065,\n" +
            "                \"item3\": 0,\n" +
            "                \"item0\": 1401,\n" +
            "                \"deaths\": 2,\n" +
            "                \"item6\": 3348,\n" +
            "                \"item4\": 0,\n" +
            "                \"item5\": 0,\n" +
            "                \"turretKills\": 2,\n" +
            "                \"tripleKills\": 0,\n" +
            "                \"damageSelfMitigated\": 13787,\n" +
            "                \"goldSpent\": 6275,\n" +
            "                \"magicDamageDealt\": 58806,\n" +
            "                \"kills\": 4,\n" +
            "                \"doubleKills\": 0,\n" +
            "                \"firstInhibitorKill\": false,\n" +
            "                \"trueDamageTaken\": 514,\n" +
            "                \"firstBloodAssist\": false,\n" +
            "                \"firstBloodKill\": true,\n" +
            "                \"assists\": 5,\n" +
            "                \"totalScoreRank\": 0,\n" +
            "                \"neutralMinionsKilled\": 57,\n" +
            "                \"combatPlayerScore\": 0,\n" +
            "                \"visionWardsBoughtInGame\": 0,\n" +
            "                \"damageDealtToTurrets\": 1340,\n" +
            "                \"physicalDamageDealtToChampions\": 1335,\n" +
            "                \"pentaKills\": 0,\n" +
            "                \"trueDamageDealt\": 5888,\n" +
            "                \"trueDamageDealtToChampions\": 568,\n" +
            "                \"champLevel\": 13,\n" +
            "                \"participantId\": 5,\n" +
            "                \"firstInhibitorAssist\": true,\n" +
            "                \"firstTowerKill\": true,\n" +
            "                \"totalHeal\": 10762,\n" +
            "                \"totalMinionsKilled\": 19,\n" +
            "                \"physicalDamageDealt\": 21708,\n" +
            "                \"damageDealtToObjectives\": 3175,\n" +
            "                \"sightWardsBoughtInGame\": 0,\n" +
            "                \"totalDamageDealtToChampions\": 10229,\n" +
            "                \"totalUnitsHealed\": 1,\n" +
            "                \"inhibitorKills\": 0,\n" +
            "                \"totalDamageTaken\": 18968,\n" +
            "                \"killingSprees\": 1,\n" +
            "                \"timeCCingOthers\": 42,\n" +
            "                \"physicalDamageTaken\": 16075\n" +
            "            },\n" +
            "            \"spell1Id\": 11,\n" +
            "            \"participantId\": 5,\n" +
            "            \"runes\": [\n" +
            "                {\n" +
            "                    \"runeId\": 5268,\n" +
            "                    \"rank\": 2\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5273,\n" +
            "                    \"rank\": 7\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5289,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5317,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5357,\n" +
            "                    \"rank\": 3\n" +
            "                }\n" +
            "            ],\n" +
            "            \"highestAchievedSeasonTier\": \"UNRANKED\",\n" +
            "            \"masteries\": [\n" +
            "                {\n" +
            "                    \"masteryId\": 6114,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6122,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6134,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6143,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6211,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6223,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6231,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6241,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6251,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6262,\n" +
            "                    \"rank\": 1\n" +
            "                }\n" +
            "            ],\n" +
            "            \"spell2Id\": 4,\n" +
            "            \"teamId\": 200,\n" +
            "            \"timeline\": {\n" +
            "                \"lane\": \"JUNGLE\",\n" +
            "                \"participantId\": 5,\n" +
            "                \"goldPerMinDeltas\": {\n" +
            "                    \"0-10\": 298.1,\n" +
            "                    \"10-20\": 326\n" +
            "                },\n" +
            "                \"creepsPerMinDeltas\": {\n" +
            "                    \"0-10\": 0.2,\n" +
            "                    \"10-20\": 1.3\n" +
            "                },\n" +
            "                \"xpPerMinDeltas\": {\n" +
            "                    \"0-10\": 368.6,\n" +
            "                    \"10-20\": 456.70000000000005\n" +
            "                },\n" +
            "                \"role\": \"NONE\",\n" +
            "                \"damageTakenPerMinDeltas\": {\n" +
            "                    \"0-10\": 664.5,\n" +
            "                    \"10-20\": 885.3\n" +
            "                }\n" +
            "            },\n" +
            "            \"championId\": 57\n" +
            "        },\n" +
            "        {\n" +
            "            \"stats\": {\n" +
            "                \"item1\": 1037,\n" +
            "                \"totalPlayerScore\": 0,\n" +
            "                \"visionScore\": 0,\n" +
            "                \"unrealKills\": 0,\n" +
            "                \"win\": true,\n" +
            "                \"objectivePlayerScore\": 0,\n" +
            "                \"largestCriticalStrike\": 0,\n" +
            "                \"totalDamageDealt\": 97781,\n" +
            "                \"magicDamageDealtToChampions\": 4354,\n" +
            "                \"largestMultiKill\": 1,\n" +
            "                \"largestKillingSpree\": 3,\n" +
            "                \"quadraKills\": 0,\n" +
            "                \"totalTimeCrowdControlDealt\": 35,\n" +
            "                \"magicalDamageTaken\": 6338,\n" +
            "                \"longestTimeSpentLiving\": 382,\n" +
            "                \"neutralMinionsKilledEnemyJungle\": 2,\n" +
            "                \"firstTowerAssist\": false,\n" +
            "                \"neutralMinionsKilledTeamJungle\": 7,\n" +
            "                \"goldEarned\": 9107,\n" +
            "                \"item2\": 1043,\n" +
            "                \"item3\": 3006,\n" +
            "                \"item0\": 3115,\n" +
            "                \"deaths\": 1,\n" +
            "                \"item6\": 3348,\n" +
            "                \"item4\": 1026,\n" +
            "                \"item5\": 0,\n" +
            "                \"turretKills\": 3,\n" +
            "                \"tripleKills\": 0,\n" +
            "                \"damageSelfMitigated\": 5400,\n" +
            "                \"goldSpent\": 7175,\n" +
            "                \"magicDamageDealt\": 64441,\n" +
            "                \"kills\": 3,\n" +
            "                \"doubleKills\": 0,\n" +
            "                \"firstInhibitorKill\": false,\n" +
            "                \"trueDamageTaken\": 130,\n" +
            "                \"firstBloodAssist\": false,\n" +
            "                \"firstBloodKill\": false,\n" +
            "                \"assists\": 2,\n" +
            "                \"totalScoreRank\": 0,\n" +
            "                \"neutralMinionsKilled\": 9,\n" +
            "                \"combatPlayerScore\": 0,\n" +
            "                \"visionWardsBoughtInGame\": 0,\n" +
            "                \"damageDealtToTurrets\": 4802,\n" +
            "                \"physicalDamageDealtToChampions\": 2234,\n" +
            "                \"pentaKills\": 0,\n" +
            "                \"trueDamageDealt\": 0,\n" +
            "                \"trueDamageDealtToChampions\": 0,\n" +
            "                \"champLevel\": 13,\n" +
            "                \"participantId\": 6,\n" +
            "                \"firstInhibitorAssist\": true,\n" +
            "                \"firstTowerKill\": false,\n" +
            "                \"totalHeal\": 3584,\n" +
            "                \"totalMinionsKilled\": 171,\n" +
            "                \"physicalDamageDealt\": 33340,\n" +
            "                \"damageDealtToObjectives\": 9377,\n" +
            "                \"sightWardsBoughtInGame\": 0,\n" +
            "                \"totalDamageDealtToChampions\": 6588,\n" +
            "                \"totalUnitsHealed\": 3,\n" +
            "                \"inhibitorKills\": 0,\n" +
            "                \"totalDamageTaken\": 12060,\n" +
            "                \"killingSprees\": 1,\n" +
            "                \"timeCCingOthers\": 3,\n" +
            "                \"physicalDamageTaken\": 5591\n" +
            "            },\n" +
            "            \"spell1Id\": 3,\n" +
            "            \"participantId\": 6,\n" +
            "            \"runes\": [\n" +
            "                {\n" +
            "                    \"runeId\": 5273,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5289,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5317,\n" +
            "                    \"rank\": 9\n" +
            "                },\n" +
            "                {\n" +
            "                    \"runeId\": 5337,\n" +
            "                    \"rank\": 3\n" +
            "                }\n" +
            "            ],\n" +
            "            \"highestAchievedSeasonTier\": \"UNRANKED\",\n" +
            "            \"masteries\": [\n" +
            "                {\n" +
            "                    \"masteryId\": 6111,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6121,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6134,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6143,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6154,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6162,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6312,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6323,\n" +
            "                    \"rank\": 1\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6331,\n" +
            "                    \"rank\": 5\n" +
            "                },\n" +
            "                {\n" +
            "                    \"masteryId\": 6343,\n" +
            "                    \"rank\": 1\n" +
            "                }\n" +
            "            ],\n" +
            "            \"spell2Id\": 4,\n" +
            "            \"teamId\": 200,\n" +
            "            \"timeline\": {\n" +
            "                \"lane\": \"JUNGLE\",\n" +
            "                \"participantId\": 6,\n" +
            "                \"goldPerMinDeltas\": {\n" +
            "                    \"0-10\": 241.5,\n" +
            "                    \"10-20\": 408.5\n" +
            "                },\n" +
            "                \"creepsPerMinDeltas\": {\n" +
            "                    \"0-10\": 6.5,\n" +
            "                    \"10-20\": 8.6\n" +
            "                },\n" +
            "                \"xpPerMinDeltas\": {\n" +
            "                    \"0-10\": 394.1,\n" +
            "                    \"10-20\": 552.4\n" +
            "                },\n" +
            "                \"role\": \"NONE\",\n" +
            "                \"damageTakenPerMinDeltas\": {\n" +
            "                    \"0-10\": 471.5,\n" +
            "                    \"10-20\": 548.1\n" +
            "                }\n" +
            "            },\n" +
            "            \"championId\": 10\n" +
            "        }\n" +
            "    ],\n" +
            "    \"gameDuration\": 1367,\n" +
            "    \"gameCreation\": 1501647459616\n" +
            "}";
}
