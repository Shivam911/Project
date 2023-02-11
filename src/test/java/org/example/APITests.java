package org.example;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class APITests {

    JSONPlaceholderAPI api = JSONPlaceholderAPI.getInstance();

    @Test
    public void testGetPhotos() throws IOException {
        var photos = api.getPhotos().execute().body();
        assertNotNull(photos);
        assertEquals(5000, photos.size(), "There should be 5000 photos");

        var photo = photos.get(0);
        assertEquals(1, photo.getAlbumId());
        assertEquals(1, photo.getId());
        assertEquals("accusamus beatae ad facilis cum similique qui sunt", photo.getTitle());
    }

    @Test
    public void testGetPosts() throws IOException {
        var posts = api.getPosts().execute().body();
        assertNotNull(posts);
        assertEquals(100, posts.size(), "There should be 100 posts");

    }

    @Test
    public void testGetComments() throws IOException {
        var comments = api.getComments().execute().body();
        assertNotNull(comments);
        assertEquals(500, comments.size(), "There should be 500 comments");
    }


}
