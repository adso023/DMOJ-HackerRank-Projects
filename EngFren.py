def countS(line):
    sCount = 0
    for i in line:
        if i == "s" or i == "S":
            sCount = sCount + 1
    return sCount

def countT(line):
    tCount = 0
    for i in line:
        if i == "t" or i == "T":
            tCount = tCount + 1
    return tCount

def countTS(lines):
    tCharacters = 0
    sCharacters = 0
    for i in lines:
        tCharacters = tCharacters + countT(i)
        sCharacters = sCharacters + countS(i)

    #print(str(tCharacters) + " " + str(sCharacters))

    if(tCharacters == sCharacters or sCharacters > tCharacters):
        return "French"
    else:
        return "English"


numLines = int(input(""))
lines = []
for i in range(0, numLines):
    lines.append(input(""))

#print(lines)
print(countTS(lines))
