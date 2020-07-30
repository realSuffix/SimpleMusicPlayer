use crate::data::*;
use std::collections::HashMap;
use uuid::Uuid;

pub struct SoundServer {
    /// Albums are identified by an ID
    /// which is generated when parsing the songs
    /// so that they can be easily
    /// identified in requests
    pub albums: HashMap<Uuid, Album>,
}

impl SoundServer {
    pub fn new() -> Self {
        todo!()
    }
}
