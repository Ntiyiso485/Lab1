let students=[
    {name:"Ntiyiso",age:23,mark:75,course:"Computer Science"},
    {name:"Siya",age:24,mark:70,course:"IT"},
    {name:"Duniso",age:20,mark:90,course:"Mechanical Engineering"},
    {name:"Bradley",age:27,mark:90,course:"Mining Engineering"},
    {name:"Voningo",age:23,mark:52,course:"Law"}
];
function displayStudents(students) {
    for(student of students){
        console.log("Name:"+student.name);
        console.log("Mark:"+student.mark);

    }

}
function calculateAverage(students) {
    // Calculate and return the average mark
    let total=0;
    for(student of students){
        total=total+student.mark;
    }
    let avg=total/students.length;
    return avg;
}
function findTopStudent(students) {
    // Find and return the student with the highest mark
    let newHighest=students[0];
    for(student of students){
        if(student.mark>newHighest.mark)
        {
            newHighest=student;
        }
    }
    return newHighest;


}
displayStudents(students);
console.log(calculateAverage(students));
console.log(findTopStudent(students));