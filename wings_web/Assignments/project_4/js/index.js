let menuButton=document.querySelector('.menu-button');
let nav=document.querySelector('nav');
let header=document.querySelector('header');
let menuIcon=document.querySelector('.menu-icon');
const menuIconBefore = document.querySelectorAll('.menu-icon:before');
const menuIconAfter = document.querySelectorAll('.menu-icon:after');
let isNavDisplayed=false;
let isNavDisplayedOnHover=false;
menuIconAfter.forEach(element => {
    console.log(element);
});
function colorMenuButton(){
    if(nav.classList.contains('visible')){
            menuButton.classList.add('clicked-button');
            menuIcon.classList.add('clicked-icon');
            menuIconBefore.classList.add('clicked-icon');
            menuIconAfter.classList.add('clicked-icon');
        }
    else{
        menuButton.classList.remove('clicked-button');
        menuIcon.classList.remove('clicked-icon');
        menuIconBefore.classList.remove('clicked-icon');
        menuIconAfter.classList.remove('clicked-icon');
    }
}

menuButton.onmouseover = function() {
    this.style.cursor = "pointer";
};

menuButton.addEventListener('click', () =>{
    nav.classList.toggle('visible');
    colorMenuButton();
});

menuButton.addEventListener('mouseenter', () =>{
    nav.classList.add('visible');
    colorMenuButton();
});

header.addEventListener('mouseleave', () =>{
    nav.classList.remove('visible');
    colorMenuButton();
});
