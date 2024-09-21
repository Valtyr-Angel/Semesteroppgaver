import file_handler


film1 = {"name": "Inception",
           "year": 2010, 
           "rating": 8.7,
           }
film2 = {"name": "Inside Out",
           "year": 2015, 
           "rating": 8.1,
           }
film3 = {"name": "Con Air",
           "year": 1997, 
           "rating": 6.9,
           }
filmer= [film1,film2,film3]






#5.1+bonus1
def addtolist( moviename=5, releaseyear=5, imbdrating=5,operator="a") :
    new_movie= dict (name = moviename, year = releaseyear , rating=imbdrating)
    
    if operator == "a":
        new_movie= dict (name = moviename, year = releaseyear , rating=imbdrating)
        filmer.append(new_movie)
    if operator == "r":
        for x in range(len(filmer)):
            if str(filmer[x]["name"]).lower()==str(moviename).lower():
                del filmer[x]
        
    if operator == "c":
        for x in range(len(filmer)):
            if str(filmer[x]["name"]).lower()==str(moviename).lower():
                moviename=input("hva skal filmens navn endres til?: ")
                releaseyear=input("hvilket årstall skall slippåret endres til?: ")
                imbdrating=input("hvilken rating skal ratingen endres til?: ")
                filmer[x]["name"]=moviename
                filmer[x]["year"]=releaseyear
                filmer[x]["rating"]=imbdrating

addtolist("Primer",2004,6.7 )
addtolist("Predestination",2014,7.4)
addtolist("Source Code",2011,7.5)


#5.2
def printliste(filmer):
    stopper=int(len(filmer))
    for x in range(stopper):
        print (f'{filmer[x]["name"]} - {filmer[x]["year"]} has a rating of {filmer[x]["rating"]} ')
        print()

def sortbyyear(filmer):
    sortedlist=(sorted(filmer, key=lambda i: i['year']))
    
    print(*sortedlist,sep="\n")
        
def averagescore(filmer) :
    summation=[]
    stopper=int(len(filmer))
    for x in range(stopper):
        #print(filmer[x]["rating"])
        summation.append(filmer[x]["rating"])
        #print(summation)
    finalsum=sum(summation)
        #print(finalsum)
    print(round(finalsum/stopper,1))

def moviesreleasedafter(list,year):
    releaselist=[]
    stopper=int(len(list))
    for x in range(stopper):
        if (list[x]["year"])>year:
            releaselist.append(list[x])
    sortbyyear(releaselist)

#printliste(filmer)
#sortbyyear(filmer)
#averagescore(filmer)
#moviesreleasedafter(filmer,2010)




#5.3
def writetodisk(filmer,filename):
    filename=str(filename)+".txt"
    with open(filename,"w") as fil:
       stopper=int(len(filmer))
       for x in range(stopper):
        
        fil.write (f'{filmer[x]["name"]} - {filmer[x]["year"]} has a rating of {filmer[x]["rating"]} ')
        fil.write ("\n")

def readfromdisk (filname):
    try:
        x=-1
        with open (filname+".txt") as fil:
            linelist= fil.readlines()
            for x in range (len(linelist)):
                print(linelist[x])
    except FileNotFoundError:
        print("file not found")

#writetodisk(filmer,"FILMTEST")
#readfromdisk("FILMTEST")

#BONUS3
#bonus2 A
#file_handler.module_writetodisk(filmer,"filmliste")
#file_handler.module_readfromdisk("filmliste")


#bonus2 B
#test1=file_handler.module_disktolist("filmliste")
#print(type(test1))

#bonus2 C
#file_handler.module_dicttojson(film1,"jsontest")

#bonus2 D
#dicttest=file_handler.module_diskjsontodict("jsontest","jsontest")
#print(dicttest)
#print(type(dicttest))

#test2=file_handler.module_diskjsontodict("jsontest","jsontest")
#file_handler.module_dicttoprettylist(test2)
#print(type(test2))

