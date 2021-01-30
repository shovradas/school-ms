Clone (1 time)

1. Choose a task

2. Create a branch
    Convention:
    feature/{issue-id}-dash-separated-issue-title
    Ex: feature/2-add-new-student

3. Fetch branch
    git fetch origin branch_name
    Ex: git fetch origin feature/2-add-new-student

4. Checkout
    git checkout branch_name
    Ex: git checkout feature/2-add-new-student

5. Do the task, commit
    git commit -m "#{id}: Relavant message"
    Ex: git commit -m "#2: Add new Student added"

6. When you are done then Push
    git push

7. Create pull request your branch to develop
    Assign me as code reviewer


useful commands
git branch -a
git branch -d feature/2-add-new-student
git remote prune origin