package tharshi.rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class GithubUser {
    String login;
    int id;
    String node_id;
    String avatar_url;
    String gravatar_id;
    String url;
    String html_url;
    String followers_url;
    String following_url;
    String gists_url;
    String starred_url;
    String subscriptions_url;
    String organizations_url;
    String repos_url;
    String events_url;
    String received_events_url;
    String type;
    boolean site_admin;
    String name;
    Object company;
    String blog;
    String location;
    Object email;
    Object hireable;
    String bio;
    String twitter_username;
    int public_repos;
    int public_gists;
    int followers;
    int following;
    Date created_at;
    Date updated_at;


}