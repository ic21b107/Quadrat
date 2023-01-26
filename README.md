# How to use the Quadrat API
Enter ```http://localhost:8080/square?number=30``` in the address bar of a browser (30 is only an example)
The result is the square of the entered number, in this example 900

# What have been done
1. A spring project was created with the "Spring Initializr" generator and "Spring Web" as dependency
2. The project was shared on github(commit and push)
3. The project was then verified on github self.
4. A develop 'develop' branch was created (New Branch from 'origin/master')
5. A feature 'feature/square' branch was created (New Branch from 'develop')
6. The board on Github was created (Actions -> New Project -> Board -> Create) with the template 'Board'
7. A user story item was created 'As a User I want to get the square of an entered number'
8. A new java class for the controller was created
9. The ```@RestController``` was added on top of the class
10. A function was implemented which returns the square of a given number
11. The ```@GetMapping("/square") ``` was added on top of the function
12. I tried if the implementation do what it shall do
13. Commit and push the changes in the feature branch
14. The action then moved from 'Todo' -> 'In Progress'
15. The Continuous Integration Pipeline was created (Actions -> Java with Maven), the name was also changed to maven_develop.yml
16. Changes in the Yaml file was done accordingly
17. The Yaml file was then committed to master
18. In IntelliJ the master must be checked out and then merged to develop and afterward pushed
19. The feature branch was checked out
20. Merge develop into feature and pushed
21. Create a Pull Request (Base: develop <- compare: feature/square)
22. After the checks were done, merge pull request and confirm merge
23. The Continuous Integration Pipeline was created (Actions -> Java with Maven), the name was also changed to maven_develop.yml
24. Changes in the Yaml file was done accordingly
25. The Yaml file was then committed to master
26. Create a Pull Request (Base: master <- compare: develop)
27. After the checks were done, merge pull request and confirm merge
28. Now the build artifact can be downloaded