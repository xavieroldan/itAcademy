$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("chooseSong.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "As a user, when there is no current song in the university, I want to choose a new song so all other users can listen to it.",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "List all university\u0027s songs",
  "description": "",
  "id": ";list-all-university\u0027s-songs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "\"BCNACTIVA\" isn\u0027t playing any song",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "have these songs on its store:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 11
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "300",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 12
    },
    {
      "cells": [
        "Joss",
        "Rulas",
        "300",
        "http://www.testing.com",
        "http://www.test.com"
      ],
      "line": 13
    },
    {
      "cells": [
        "Ready?",
        "Pep Sala",
        "300",
        "http://www.tet.com",
        "http://www.test.com"
      ],
      "line": 14
    },
    {
      "cells": [
        "Juliar",
        "Adele",
        "300",
        "http://www.ted.com",
        "http://www.test.com"
      ],
      "line": 15
    },
    {
      "cells": [
        "Join",
        "Apple",
        "300",
        "http://www.text.com",
        "http://www.test.com"
      ],
      "line": 16
    },
    {
      "cells": [
        "Pelo",
        "Montana",
        "300",
        "http://www.temt.com",
        "http://www.test.com"
      ],
      "line": 17
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user searches for all songs of university \"BCNACTIVA\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "will return next songs:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 25
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "300",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 26
    },
    {
      "cells": [
        "Joss",
        "Rulas",
        "300",
        "http://www.testing.com",
        "http://www.test.com"
      ],
      "line": 27
    },
    {
      "cells": [
        "Ready?",
        "Pep Sala",
        "300",
        "http://www.tet.com",
        "http://www.test.com"
      ],
      "line": 28
    },
    {
      "cells": [
        "Juliar",
        "Adele",
        "300",
        "http://www.ted.com",
        "http://www.test.com"
      ],
      "line": 29
    },
    {
      "cells": [
        "Join",
        "Apple",
        "300",
        "http://www.text.com",
        "http://www.test.com"
      ],
      "line": 30
    },
    {
      "cells": [
        "Pelo",
        "Montana",
        "300",
        "http://www.temt.com",
        "http://www.test.com"
      ],
      "line": 31
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "BCNACTIVA",
      "offset": 1
    }
  ],
  "location": "ChooseSongTests.isn_t_playing_any_song(String)"
});
formatter.result({
  "duration": 325304800,
  "status": "passed"
});
formatter.match({
  "location": "ChooseSongTests.have_these_songs_on_its_store(SongDTO\u003e)"
});
formatter.result({
  "duration": 65246100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BCNACTIVA",
      "offset": 43
    }
  ],
  "location": "ChooseSongTests.user_searches_for_all_songs_of_university(String)"
});
formatter.result({
  "duration": 8295100,
  "status": "passed"
});
formatter.match({
  "location": "ChooseSongTests.will_return_next_songs(SongDTO\u003e)"
});
formatter.result({
  "duration": 2406300,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Invalid information",
  "description": "",
  "id": ";invalid-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "university \"BCNACTIVA\" is not playing any song",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "tries to add these songs:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 42
    },
    {
      "cells": [
        "",
        "Adele",
        "1",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 43
    },
    {
      "cells": [
        "Hero",
        "",
        "1",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 44
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "-1",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 45
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "1",
        "",
        "http://www.test.com"
      ],
      "line": 46
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "1",
        "http://www.test.com",
        ""
      ],
      "line": 47
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "receives a \"406\" error",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "BCNACTIVA",
      "offset": 12
    }
  ],
  "location": "ChooseSongTests.university_is_not_playing_any_song(String)"
});
formatter.result({
  "duration": 16423700,
  "status": "passed"
});
formatter.match({
  "location": "ChooseSongTests.tries_to_add_these_songs(SongDTO\u003e)"
});
formatter.result({
  "duration": 72745900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "406",
      "offset": 12
    }
  ],
  "location": "ChooseSongTests.receives_a_error(int)"
});
formatter.result({
  "duration": 83400,
  "status": "passed"
});
formatter.uri("listenCurrentSong.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "As a user, I want to listen to my university\u0027s current song, so I can discover awesome music.",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Users logged in a university, should be able to listen current song.",
  "description": "",
  "id": ";users-logged-in-a-university,-should-be-able-to-listen-current-song.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "\"BCNACTIVA\" is playing:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 10
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "300",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 11
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user searches for university \"BCNACTIVA\" current song",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "will return a song:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 18
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "300",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "BCNACTIVA",
      "offset": 1
    }
  ],
  "location": "ListenCurrentSongTests.is_playing(String,SongDTO\u003e)"
});
formatter.result({
  "duration": 26159400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BCNACTIVA",
      "offset": 30
    }
  ],
  "location": "ListenCurrentSongTests.user_searches_for_university_current_song(String)"
});
formatter.result({
  "duration": 4843800,
  "status": "passed"
});
formatter.match({
  "location": "ListenCurrentSongTests.will_return_a_song(SongDTO\u003e)"
});
formatter.result({
  "duration": 399100,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "If there is not a current song, user should receive a Not Found error.",
  "description": "",
  "id": ";if-there-is-not-a-current-song,-user-should-receive-a-not-found-error.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "\"BCNACTIVA\" is not playing any song",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "user searches for university\u0027s \"BCNACTIVA\" current song",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Not Found error will be returned",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "BCNACTIVA",
      "offset": 1
    }
  ],
  "location": "ListenCurrentSongTests.is_not_playing_any_song(String)"
});
formatter.result({
  "duration": 13108000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BCNACTIVA",
      "offset": 32
    }
  ],
  "location": "ListenCurrentSongTests.user_searches_for_university_s_current_song(String)"
});
formatter.result({
  "duration": 9849500,
  "status": "passed"
});
formatter.match({
  "location": "ListenCurrentSongTests.not_Found_error_will_be_returned()"
});
formatter.result({
  "duration": 54000,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "If there is no time left to the current song, user should receive a Not Found error.",
  "description": "",
  "id": ";if-there-is-no-time-left-to-the-current-song,-user-should-receive-a-not-found-error.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "\"BCNACTIVA\" is playing a song:",
  "rows": [
    {
      "cells": [
        "title",
        "artistName",
        "duration",
        "songUrl",
        "imageUrl"
      ],
      "line": 32
    },
    {
      "cells": [
        "Hero",
        "Adele",
        "1",
        "http://www.test.com",
        "http://www.test.com"
      ],
      "line": 33
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "System waits for \"2\" seconds",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user searches for \"BCNACTIVA\" song",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Not Found error will be shown",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "BCNACTIVA",
      "offset": 1
    }
  ],
  "location": "ListenCurrentSongTests.is_playing_a_song(String,SongDTO\u003e)"
});
formatter.result({
  "duration": 23104800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 18
    }
  ],
  "location": "ListenCurrentSongTests.system_waits_for_seconds(int)"
});
formatter.result({
  "duration": 2000523500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BCNACTIVA",
      "offset": 19
    }
  ],
  "location": "ListenCurrentSongTests.user_searches_for_song(String)"
});
formatter.result({
  "duration": 9276100,
  "status": "passed"
});
formatter.match({
  "location": "ListenCurrentSongTests.not_Found_error_will_be_shown()"
});
formatter.result({
  "duration": 41600,
  "status": "passed"
});
});