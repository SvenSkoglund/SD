var jobs = [
  {
    company : "Amazon",
    title : "UX/UI Developer",
    salary : 72000
  },
  {
    company : "IBM",
    title : "Software Engineer",
    salary : 84000
  },
  {
    company : "Home Advisor",
    title : "Jr. Java Developer",
    salary : 65000
  },
  {
    company : "Fidelity",
    title : "Senior Software Engineer",
    salary : 137000
  },
  {
    company : "Google",
    title : "IT Help Desk",
    salary : 48000
  }
];

var lists = document.getElementsByClassName('list');

for (var i = 0; i < lists.length; i++) {
  lists[i].textContent = jobs[i].company;
  lists[i].addEventListener('click',function(e){
    var index = e.target.id;
    document.getElementById("title").textContent = jobs[index].title;
    document.getElementById("company").textContent = jobs[index].company;
    document.getElementById("salary").textContent = jobs[index].salary;
  })
}
