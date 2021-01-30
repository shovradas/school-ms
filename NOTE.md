### Instruction for Team
Clone the repository (1 time only)

1. Choose a task

2. Create a branch

    Convention: `feature/{issue-id}-dash-separated-lowercase-issue-title`

    Example: `feature/2-add-new-student`

3. Fetch branch

    Command: `git fetch origin branch_name`

    Example: `git fetch origin feature/2-add-new-student`

4. Checkout

    Command: `git checkout branch_name`

    Example: `git checkout feature/2-add-new-student`

5. Do the task and commit

    Command: `git commit -m "#{id}: Relavant message"`

    Example: `git commit -m "#2: Add new Student added"`

6. When you are done then Push
    Command: `git push`

7. Create pull request your branch to develop
    > Assign me as code reviewer

### Useful Commands
```
git branch -a
git branch -d feature/2-add-new-student
git remote prune origin
```

## Database
    Server: pgsql.hrz.tu-chemnitz.de
    Database: schoolmsdb
    User: schoolmsdb_rw
    Password: evaiw2Ae