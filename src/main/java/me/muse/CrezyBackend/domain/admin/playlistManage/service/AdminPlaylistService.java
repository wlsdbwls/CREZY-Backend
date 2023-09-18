package me.muse.CrezyBackend.domain.admin.playlistManage.service;

import me.muse.CrezyBackend.domain.admin.playlistManage.controller.form.*;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;

public interface AdminPlaylistService {
    todayStatusPlaylistResponseForm todayStatusPlaylist(HttpHeaders headers, String date);

    Page<AdminPlaylistSelectListForm> playlistRecentList(HttpHeaders headers, AdminPlaylistsRequestForm requestForm);

    AdminPlaylistReadResponseForm readPlaylist(HttpHeaders headers, Long playlistId);

    void changePlaylistName(HttpHeaders headers, Long playlistId);

    void changePlaylistThumbnailName(HttpHeaders headers, Long playlistId);

    void deletePlaylist(HttpHeaders headers, Long playlistId);
}
