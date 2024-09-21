playermax=input(f"hvor mange spillere spiller?:")
playermax=int(playermax)

roundsplayed=0
rounds=0
rounds=input(f"hvor mange runder spiller  dere?:")
rounds=int(rounds)

darts=0
darts=input(f"hvor mange darts kaster dere?:")
darts=int(darts)

playermin=0
currentplayer=0

import random

for x in range (rounds) :
    playerscore=[]
    playermin=0
    currentplayer=0
    while playermin<playermax :
        playerscore=[]
        currentplayer+=1
        print(f"player {currentplayer}")
        for x in range (darts):
            print(f"throw:{x+1}")
            path=random.randrange(1,4)

            if path== 1:
                subscore=random.randrange(0,21)
                multiplier=random.randrange(1,4)
                subscore=subscore*multiplier
                print(subscore)

            if path == 2:
                subscore=25
                print(subscore)

            if path == 3:
                subscore=50
                print(subscore)

            playerscore.append(subscore)
        playerscore_total=sum(playerscore)
        print(f"spiller {currentplayer} sin totalscore er:{playerscore_total}")
        playermin += 1

        


print(f"rounds played:{rounds}")
print(f"darts thrown:{darts}")
print(f"players:{playermax}")
        

    