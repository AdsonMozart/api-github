package br.com.mozar7.api_github.controller;

import br.com.mozar7.api_github.client.GithubClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class GithubController {

    @Autowired
    private GithubClient githubClient;

    @GetMapping("repos")
    public ResponseEntity<List<RepositoryResponse>> listRepos() {
        return null;
    }
}
