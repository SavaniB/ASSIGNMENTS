
     function reverseWordsInSentence(sentence) {
    // Split the sentence into words using space as a delimiter
    let words = sentence.split(' ');
    let reversedWords = [];

    for (let i = 0; i < words.length; i++) {
        let word = words[i];
        let reversedWord = reverseWord(word);
        reversedWords.push(reversedWord);
    }

    return reversedWords.join(' ');
}

function reverseWord(word) {
    let reversed = '';
    for (let i = word.length - 1; i >= 0; i--) {
        reversed += word[i];
    }
    return reversed;
}

// Example usage:
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
