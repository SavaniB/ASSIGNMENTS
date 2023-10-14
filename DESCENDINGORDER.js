const numbers = [5, 2, 9, 1, 5, 6];

// Use the sort() method with a custom comparison function
numbers.sort(function(a, b) {
    return b - a; // Sort in descending order
});

console.log(numbers); // Output: [9, 6, 5, 5, 2, 1]

