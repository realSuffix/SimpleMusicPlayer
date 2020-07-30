use serde::{Deserialize, Serialize};
use std::path::PathBuf;

#[derive(Deserialize, Serialize)]
pub struct Album {
    /// The name of the album
    pub name: String,
    /// The directory in which it's songs are located
    pub path: PathBuf,
    /// The actual songs
    pub songs: Vec<Song>,
}

#[derive(Deserialize, Serialize)]
pub struct Song {
    /// The name of the song
    pub name: String,
    /// This is used in combination with the path
    /// which is already present in the corresponding album
    /// to determine the full path
    pub file_name: String,
}

impl Album {
    pub fn new(name: String, path: PathBuf) -> Self {
        Self {
            name,
            path,
            songs: Vec::new(),
        }
    }
}

impl Song {
    pub fn new(name: String, file_name: String) -> Self {
        Self { name, file_name }
    }
}
