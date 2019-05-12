package com.git.client;

public class GitClient {


    private static final String GIT_REPO = "";
    private static final String GIT_USERNAME = "";
    private static final String GIT_PASSWORD = "";

    public static void main(String[] args) {
        System.out.println("commit-1");

        System.out.println("test branch commit-1");

        System.out.println("created a local branch..");

        System.out.println("created a dev branch.. and dev branch changes..");
        System.out.println("local branch changes to create a conflict with dev-branch");
    }
}
