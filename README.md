# spa-day-starter-code

After all of the hard work we have put into learning about Thymeleaf, it is time for a spa day! First, we need to put our knowledge of Thymeleaf to the test. Instead of heading out to our favorite spa, let’s make an application for the owners!

Our application needs to do the following:

Display the user’s name and skin type under their customer profile.
Display the appropriate facial treatments for their skin type.
Display the description of the spa’s manicures or pedicures depending on the user’s interest.
As always, read through the whole page before starting to code.

--------

For this studio you will add functionality to allow users to sign up for your spa-day app.

The starter code has been modified from where you left off last class. Grab the refactored code on the user-signup-starter branch.

You’ll notice in this branch that the name field has been removed from the service selection form. Once we implement user-signup functionality, we can use a given user’s name to identify the spa client. We’ve also moved data into a Client model and out of the SpaDayController class.

In this studio, we’ll ask you to write another model, User. User and Client may at first appear redundant, but in the future as you develop your spa application, you may find a scenario where a user is logging in who is not also Client.

