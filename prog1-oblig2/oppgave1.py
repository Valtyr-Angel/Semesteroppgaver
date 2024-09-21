
answer=input("Hva er svaret på det ultimate spørsmålet om livet, universet og alle ting? Hint: Det er et tall.")

answer= int(answer)

if answer == 42:  
    print("Det stemmer, meningen med livet er 42!")
elif  50 > answer and answer > 30:
    print ("Nærme, men feil")

else:
    print("FEIL!")
