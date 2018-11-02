# Online-Job-Portal
This is an online job portal website implemented using Spring MVC and hibernate to allow users to post jobs as well apply for the posted jobs. The users can view all jobs posted on the website but you cannot apply to a job unless you are logged in. New users can register themselves to apply for the job. There is an option for registration on the log in screen for new users to create an account. Mail api is implemented which gives notification to the user when he applies for a new job. An employer can also post job on the website but he too needs to register himself to be able to post. An employer also registers with the company he is affiliated and he can post jobs for that company only. Employers are able to view all jobs posted by other employers too from the same company. He can also update jobs for the company that he belongs to. Authorization and authentication has been implemented along with validation and sanitation. The website is safe and secured from sql injection and it does not allow unauthorized access to other pages.

Functionality:  
Implemented interceptor and validator along with filters for sanitization. Also implemented mail api to give notification to the user when a new job application is done.


Roles:  
Employer – Can register itself, can login and post job, update and delete jobs from the website  
Employee – Can register itself, can login and apply for the jobs posted on the website  

Technologies:  
Spring MVC  
Hibernate  
Javax Mail API  
HandlerInterceptorAdapter  
Validator  
Filter  
