function reverseWords(sentence) {
    // Split the sentence into words
    const words = sentence.split(" ");
    
    // Reverse each word and store them in a new array
    const reversedWords = words.map(word => reverseString(word));
    
    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(" ");
    
    return reversedSentence;
}

function reverseString(str) {
    // Convert the string to an array of characters, reverse it, and join it back into a string
    return str.split("").reverse().join("");
}

const inputSentence = "This is a sunny day"; // Replace with your input sentence
const reversedResult = reverseWords(inputSentence);
console.log(reversedResult);