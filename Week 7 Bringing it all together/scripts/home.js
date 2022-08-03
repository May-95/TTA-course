// JavaScript for home page:

// Adding eventListener to icon for toggling between the light and dark theme. eventListener listens for a click and runs the function whenever it is clicked.
document.getElementById('icon').addEventListener('click', function () {
    // function toggles the class 'darkmode' on the body, links, footer icons and label elements. If the class is on the element, it removes it. If the class is not there, it adds that class so the dark theme css can be applied. 
    document.body.classList.toggle('dark-mode');
    document.getElementById('horizontalLine').classList.toggle('dark-line');
    document.getElementById('link1').classList.toggle('dark-mode');
    document.getElementById('link2').classList.toggle('dark-mode');
    document.getElementById('labelT').classList.toggle('dark-mode');
    document.getElementById('labelA').classList.toggle('dark-mode');
    document.getElementById('labelB').classList.toggle('dark-mode');
    document.getElementById('footerIcon1').classList.toggle('dark-mode');
    document.getElementById('footerIcon2').classList.toggle('dark-mode');
    document.getElementById('footerIcon3').classList.toggle('dark-mode');
    document.getElementById('footerIcon4').classList.toggle('dark-mode');
})

// function for adding new blog posts to the page. 
function addBlogPost() {
    // creating new elements and storing them in variables. For each blog post, we need an article element with h1, h3 and p nested inside it. 
    let article = document.createElement('article');
    let h1 = document.createElement('h1');
    let h3 = document.createElement('h3');
    let p = document.createElement('p');

    // storing the user's inputted values in the variables. h1Value will hold the blog post's title. h3Value = author's name. pValue = blog post's content.
    let h1Value = document.getElementById('title').value;
    let h3Value = document.getElementById('author-name').value;
    let pValue = document.getElementById('blogpost').value;

    // the newly created h1 element is assigned the user's blog post title. h3 = author's name. p = blog post content.
    h1.innerText = h1Value;
    h3.innerText = h3Value;
    p.innerText = pValue;

    // appending the article element to the div holding all the blog posts. 
    document.getElementById('posts').appendChild(article);

    // appending the new h1/h3/p elements to the article element 
    article.appendChild(h1);
    article.appendChild(h3);
    article.appendChild(p);

    // form is reset so user can add a new blog post if they wish to do so without having to refresh the page manually.
    document.getElementById('form').reset();
}

// function for checking all inputted fields are completed. 
function checkFields() {
    // if input field for title is empty, user is alerted to enter their blog post title. It then returns false. Same for author's name and blog post content.
    if (document.getElementById('title').value == '') {
        alert("Please enter the title of your blog post.");
        return false;
    } else if (document.getElementById('author-name').value == '') {
        alert("Please enter author's name.");
        return false;
    } else if (document.getElementById('blogpost').value == '') {
        alert('Please fill in the content of your blog post.');
        return false;
    } else {
        // if all fields are completed, it returns true. 
        return true;
    }
}

// eventListener is added to submit button. When clicked, it will run the function. 
document.getElementById('submit').addEventListener('click', function (e) {
    e.preventDefault();

    // if the function 'checkFields' returned a value of true, the function 'addBlogPost' will run.
    if (checkFields()) {
        addBlogPost();
    }
});


