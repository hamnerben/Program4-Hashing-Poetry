# PoetryMain

## `Poem` object
```java
hashtable;

```


## `pickNextWord(myWord)`

```java
private string pickNextWord(myWord){
    check hash table for word
    get the lenght of the followlist
    random number [0-listlength]
    iterate throught the words in the list until you hit the randnum
        return that word
        }
```

## `readPoem("file")`
```java
private hashtable readPoem("file"){
    read in the text
    create hash table
    for each word in poem:
        store the word in the hashtable
        store the next word as a follower
    return hash table
        }
```


## `WritePoetry()`

```java
public String WritePoem(file, startWord, length, printhash){
    hashtable = readPeom()
    make string toReturn
    wordCt = 0
    currWord = startword
    while(wordCt < length ){ // this is right
        append currWord toReturn
        if currword is punctuation, add newline
        get next word pickNextWord()
        store it as currword
        increase wordCt
        }
    if(printHash)
        for record in hash
            append record toReturn
        return toReturn
        }
```