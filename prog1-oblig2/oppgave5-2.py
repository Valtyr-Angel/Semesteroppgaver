playermax=input(f"hvor mange spillere spiller?(1-8):")
playermax=int(playermax)

playermin=0
currentplayer=0

import random


while playermin<playermax :
    currentplayer+=1
    print(f"player {currentplayer}")
    for x in range (3):
        print(f"throw:{x+1} {random.randrange(0,61)}")
    playermin += 1
    print()
    

#print(playermin)
