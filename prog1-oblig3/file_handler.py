import json

#test           
def test(name):
    print(name)
    return
    
#bonus2 A
def module_writetodisk(filmer,filename):
    filename=str(filename)+".txt"
    with open(filename,"w") as fil:
       stopper=int(len(filmer))
       for x in range(stopper):
        
        fil.write (f'{filmer[x]["name"]} - {filmer[x]["year"]} has a rating of {filmer[x]["rating"]} ')
        fil.write ("\n")

def module_readfromdisk (filname):
    try:
        x=-1
        with open (filname+".txt") as fil:
            linelist= fil.readlines()
            for x in range (len(linelist)):
                print(linelist[x])
    except FileNotFoundError:
        print("file not found")            


#bonus2 B
#https://www.delftstack.com/howto/python/python-readlines-without-newline/
def module_disktolist(filname):
    newlist=[]
    with open (filname+".txt") as file:
        
        for readline in file:
            line_strip = readline.strip('\n')
            
            newlist.append(line_strip)
        return (newlist)



#bonus2 C             
def module_dicttojson(listname,filename):
    with open(filename+".json", "w") as exfil:
        json.dump(listname, exfil, indent=4)



#bonus2 D
def module_diskjsontodict(filename,newdict):
    try:
        newdict={}
        with open (filename+".json") as revelation:
            emperor=json.load(revelation)
            newdict.update(emperor)
            return newdict
    except FileNotFoundError:
        print("file not found")

def module_dicttoprettylist(dict):
    for key,value in (dict.items()):
        print(key,":",value)

