import random
spades=[]
diamonds=[]
clover=[]
hearts=[]

player_hand=[]
dealer_hand=[]

dealer_hand_value=[]
player_hand_value=[]

player_value=0
dealer_value=0







def generate_cardstock():
    for x in range(13):
        x+=1
        y=x
        if x>10: 
            y=9
        hearts.append({'card_number':x+1,'type':"hearts",'actual_value':y+1})
        diamonds.append({'card_number':x+1,'type':"diamonds",'actual_value':y+1})
        clover.append({'card_number':x+1,'type':"clover",'actual_value':y+1})
        spades.append({'card_number':x+1,'type':"spades",'actual_value':y+1})


def naming(suit):

    for x in range (13):
    
        if x==9:
            (suit[x])['card_number']="jack"
            (suit[x])['actual_value']=10
        if x==10:
            (suit[x])['card_number']="queen"
        if x==11:
            (suit[x])['card_number']="king"
        if x==12:
            (suit[x])['card_number']="ace"
            (suit[x])['actual_value']=11

def game_start():
    while True:

        current_bet=int(input(f"you currently have {my_chips} chips.how many chips would you like to bet?:"))
        print(int(current_bet))
        if current_bet > my_chips:
            print("you cannot bet more than you have!")

        if current_bet < my_chips or current_bet==my_chips:
            break

    print(f"you have bet {current_bet} out of {my_chips} chips available to you")
    print("\n")
    print("the cards have been dealt, your cards are:")






def player_pull():




    
    
    dealt_card_player=[]
    target=[]

    card_selector=random.randrange(0,len(cardstock))
    card_selector2=random.randrange(0,len(cardstock))

    target=(cardstock)[card_selector]
    target2=(cardstock)[card_selector2]


    dealt_card_player.append(target)
    dealt_card_player.append(target2)

    cardstock.pop(card_selector)
    cardstock.pop(card_selector2)
    player_hand_value.append(dealt_card_player[0]['actual_value'])
    player_hand_value.append(dealt_card_player[1]['actual_value'])

    print(f"the {dealt_card_player[0]['card_number']} of {dealt_card_player[0]['type']} and {dealt_card_player[1]['card_number']} of {dealt_card_player[1]['type']} with a total value of {dealt_card_player[0]['actual_value']+dealt_card_player[1]['actual_value']} ")
    return player_hand.append(target), player_hand.append(target2)




def dealer_pull():
    
    dealt_card_dealer=[]

    card_selector=random.randrange(0,len(cardstock))
    card_selector2=random.randrange(0,len(cardstock))

    target=[]
    target2=[]
    target=(cardstock)[card_selector]
    target2=(cardstock)[card_selector2]

    dealt_card_dealer.append(target)
    dealt_card_dealer.append(target2)

    dealer_hand_value.append(dealt_card_dealer[0]['actual_value'])
    dealer_hand_value.append(dealt_card_dealer[1]['actual_value'])

    cardstock.pop(card_selector)
    cardstock.pop(card_selector2)

    print(f"the dealers shown card is {dealt_card_dealer[0]['card_number']} of {dealt_card_dealer[0]['type']}")
    return dealer_hand.append(target),dealer_hand.append(target2)

def stand():
        
    dealt_card_dealer=[]
    target=[]
        
    card_selector3=1    
    print(card_selector3)
    card_selector3=random.randrange(0,len(cardstock))
    print(card_selector3)        
    target=(cardstock)[card_selector3]

    dealt_card_dealer.append(target)
        

    cardstock.pop(card_selector3)
    dealer_hand.append(target)
    dealer_hand_value.append(target['actual_value'])




    def hit():
        dealt_card_player=[]
        card_selector=random.randrange(0,len(cardstock))
        target=(cardstock)[card_selector]
        dealt_card_player.append(target)
        cardstock.pop(card_selector)

        print(f"You have been dealt one card ({dealt_card_player[0]['actual_value']}). Your hand now consists of the following cards: ")
        player_hand.append(target)
        
        list_length=len(player_hand)
        hand_value=[]
        
        for x in range(list_length):
            print(f" - {player_hand[x]['card_number']} of {player_hand[x]['type']}")
            hand_value.append(player_hand[x]['actual_value'])
            player_hand_value.append(player_hand[x]['actual_value'])
            
        bingo=sum(hand_value,0)
        print(f"The total value of your hand is now {bingo}")
        return player_hand_value

def hit():
    dealt_card_player=[]
    card_selector=random.randrange(0,len(cardstock))
    target=(cardstock)[card_selector]
    dealt_card_player.append(target)
    cardstock.pop(card_selector)

    print(f"You have been dealt one card ({dealt_card_player[0]['actual_value']}). Your hand now consists of the following cards: ")
    player_hand.append(target)
    
    list_length=len(player_hand)
    hand_value=[]
    
    for x in range(list_length):
        print(f" - {player_hand[x]['card_number']} of {player_hand[x]['type']}")
        hand_value.append(player_hand[x]['actual_value'])
        player_hand_value.append(player_hand[x]['actual_value'])
        if player_hand[x]['card_number'] == 'ace':
            hand_value.append(-10)
        
    bingo=sum(hand_value,0)
    
    print(f"The total value of your hand is now {bingo}")
    return player_hand_value,card_selector

bingo=0
my_chips=7
currentscore=0
current_bet=0
    




while True:
    spades=[]
    diamonds=[]
    clover=[]
    hearts=[]

    player_hand=[]
    dealer_hand=[]

    dealer_hand_value=[]
    player_hand_value=[]

    player_value=0
    dealer_value=0

    for x in range(13):
        x+=1
        y=x
        if x>10: 
            y=9
        hearts.append({'card_number':x+1,'type':"hearts",'actual_value':y+1})
        diamonds.append({'card_number':x+1,'type':"diamonds",'actual_value':y+1})
        clover.append({'card_number':x+1,'type':"clover",'actual_value':y+1})
        spades.append({'card_number':x+1,'type':"spades",'actual_value':y+1})

    naming(spades)
    naming(diamonds)
    naming(clover)
    naming(hearts)
    cardstock= spades+diamonds+clover+hearts
    
    while True:
        
        current_bet=int(input(f"you currently have {my_chips} chips.how many chips would you like to bet?:"))
        print(int(current_bet))
        if current_bet > my_chips:
            print("you cannot bet more than you have!")

        if current_bet < my_chips or current_bet==my_chips:
            break

    print(f"you have bet {current_bet} out of {my_chips} chips available to you")
    print("\n")
    print("the cards have been dealt, your cards are:")
    

    player_pull()
    
    
    
        
    dealer_pull()
    #print(len(cardstock))





    while True:
        if sum(player_hand_value)==21:
            print("jackpot!")
            break

        print("Do you wish to hit or stand?")
        print("1 - Hit") 
        print("2 - Stand")
        #print(len(cardstock))
        Answer=input("Answer:")
        Answer=int(Answer)
        dealer_hand_value=[]
        player_value=sum(player_hand_value)
        dealer_value=sum(dealer_hand_value)
            

        if Answer==1:
            print("\n")            
            hit()
            print(f"the value of the dealers shown card is {dealer_hand[0]['actual_value']}")
            player_value=[]
            player_hand_value=[]
            for x in range(len(player_hand)):
                                
                player_hand_value.append(player_hand[x]['actual_value'])
                player_value=sum(player_hand_value)
                if player_hand[x]['card_number'] == 'ace':
                    player_value-=10
                    

            if player_value==21:
                print("jackpot!")
                print(player_value)
                break
                
                

            if player_value>21:
                            
                for x in range(len(player_hand)):
                    if player_hand[x]['card_number'] == 'ace':
                        player_hand[x]['actual_value'] = 1
                        player_value-=10
                        
                            
                            
                            
                        if player_value<21:
                            continue


                        if player_value>21:
                            print()
                            print("out of luck!")
                            

            if  player_value>21 or player_value==21:
                break
                            
            if player_value<21:
                continue
            
        
                
                            



                    
                
        if Answer==2:
            print("\n")
            while True:
                

                
                for x in range(len(dealer_hand)):
                            
                        dealer_hand_value.append(dealer_hand[x]['actual_value'])
                        dealer_value=sum(dealer_hand_value)
                        if dealer_hand[x]['card_number'] == 'ace':
                            dealer_value-=10
                            

                if dealer_value>17 and dealer_value<21:
                    print("dealer stands")
                    break

                if dealer_value==21:
                    print(" dealer jackpot!")
                    break












                dealt_card_dealer=[]
                target=[]
                card_selector3=random.randrange(0,41)   
                target=(cardstock)[card_selector3]

                dealt_card_dealer.append(target)
                cardstock.pop(card_selector3)
                dealer_hand.append(target)
                dealer_hand_value.append(target['actual_value'])
                    
                dealer_value=[]
                dealer_hand_value=[]

                for x in range(len(dealer_hand)):
                            
                        dealer_hand_value.append(dealer_hand[x]['actual_value'])
                        dealer_value=sum(dealer_hand_value)
                            

                if dealer_value>17 and dealer_value<21:
                    print("dealer stands")
                    print("\n")
                    break

                if dealer_value==21:
                    print(" dealer jackpot!")
                    break

                if dealer_value>21:
                    

                    for x in range(len(dealer_hand)):
                        if dealer_hand[x]['card_number'] == 'ace':
                            dealer_hand[x]['actual_value'] = 1
                            dealer_value=sum(dealer_hand_value)-10
                            print(dealer_hand)
                            break        
                    



                if dealer_value>21:
                    break

            print("the dealers hand contains:")
            for x in range(len(dealer_hand)):
                    print(f"- {dealer_hand[x]['card_number']} of {dealer_hand[x]['type']} ")
            print(f"with a total value of {dealer_value}")    
            break
                
            
                
       
        
            
        
            
            

    if player_value==21:
        print("you got the jackpot!")
        my_chips+=2*current_bet
        print(f"you have won {2*current_bet} and have {my_chips} chips now ")
    
    elif player_value>21:
        print("player bust")
        my_chips-=current_bet
        print(f"you have lost {current_bet} and have {my_chips} chips now ")

    elif dealer_value>21:
        print("dealer bust")
        my_chips+=current_bet
        print(f"you have won {current_bet} and have {my_chips} chips now ")

    elif player_value<dealer_value:
        print("you lost")
        my_chips-=current_bet
        print(f"you have lost {current_bet} and have {my_chips} chips now ")

    elif player_value>dealer_value:
        my_chips+=current_bet
        print(f"you have won {current_bet} and have {my_chips} chips now ")
        
    elif player_value==dealer_value:
        print("the house always wins")
        my_chips-=current_bet
        print(f"you have lost {current_bet} and have {my_chips} chips now ")
    
    else:
        print("error")

    print()
    
    while True:
        print("do you wish to play again?")
        print("y - Yes ")
        print("n - No ")
        restart=input("answer:")
        if restart=="n":
            print("see ya")
            exit()
            
        if  restart=="y":
            break



