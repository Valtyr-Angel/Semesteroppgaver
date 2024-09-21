pakkliste=[]
while True: 
    
    

    print("1.legg til")
    print("2.slett")
    print("3.skriv ut liste")

    choice = input("velg operasjon (1/2/3: ")

    while True :
        if choice == '1':
                
                pakkvare=input("hva skal legges til din liste?: ").lower() 
                #pakkliste.append(input("hva skal legges til din liste"))
                pakkliste.append(pakkvare)  
                print(f"du har lagt til {pakkvare} i din pakkliste ")
                print()
                break
                
        

        elif choice == '2':
            pakkvare=(input("hva skal fjernes fra listen ")).lower()
            pakkliste.remove(pakkvare)
            print(f"du har fjernet {pakkvare} fra din pakkliste ")
            print()
            break
         

        if choice == '3':   

            print ("din pakkliste inneholder:"), print(*pakkliste, sep=", ")
            print()
            break
        else:
             print("velg gyldig operator ")
             print()
             break


        
            
    
         
