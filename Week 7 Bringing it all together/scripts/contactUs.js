// JavaScript for contact us page:

// Adding eventListener to icon for toggling between the light and dark theme. eventListener listens for a click and runs the function whenever it is clicked.
document.getElementById('icon').addEventListener('click', function () {
    // function toggles the class 'darkmode' on the body, links, footer icons and label elements. If the class is on the element, it removes it. If the class is not there, it adds that class so the dark theme css can be applied. 
    document.body.classList.toggle('dark-mode');
    document.getElementById('horizontalLine').classList.toggle('dark-line');
    document.getElementById('link1').classList.toggle('dark-mode');
    document.getElementById('link2').classList.toggle('dark-mode');
    document.getElementById('labelS').classList.toggle('dark-mode');
    document.getElementById('labelC').classList.toggle('dark-mode');
    document.getElementById('footerIcon1').classList.toggle('dark-mode');
    document.getElementById('footerIcon2').classList.toggle('dark-mode');
    document.getElementById('footerIcon3').classList.toggle('dark-mode');
    document.getElementById('footerIcon4').classList.toggle('dark-mode');
})


// function to check all fields of the contact form have been filled in.
function checkFields() {
    // if the subject input field is empty, user is alerted to enter the details and it returns false. Same for the email content. 
    if (document.getElementById('subject').value == '') {
        alert('Please enter the subject of your email.');
        return false;
    } else if (document.getElementById('emailContent').value == '') {
        alert('Please enter the content of your email.');
        return false;
    } else {
        // if input fields have been filled out, function returns true.
        return true;
    }
}

// function sets href for email anchor tag to the email content and subject of the user's message.
function email() {
    // value from subject input and email content is stored in two different variables.
    let subjectEmail = document.getElementById('subject').value;
    let emailContent = document.getElementById('emailContent').value;
    // the href is set to include the subject and email content of the message so the details are transferred when the link is clicked. 
    emailLink.href = `mailto:contact@technews.com?subject=${subjectEmail}&body=${emailContent}`;
}

// eventListener added to send message link. When clicked, the function runs. 
emailLink.addEventListener('click', function (e) {
    // if checkFields returns true, the function email will run which will open their mail client and the details will be transferred to an email. Form is then reset allowing user to enter message if they wish. 
    if (checkFields()) {
        email();
        document.getElementById('form').reset();
    } else {
        // if checkFields returns false, default behaviour is prevented and mail client will not open.
        e.preventDefault();
    }
})
