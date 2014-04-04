<?php

 session_start();
// Check if we have established an authenticated
//If this page hasn't been redirected (we are allowed in) then we can display
?>
<form enctype="multipart/form-data" action="player_upload.php" method="post">

    <input type="hidden" name="MAX_FILE_SIZE" value="2000000">
    <fieldset>
    <legend>Upload Photo</legend>
    <table>
        <tr>
            <td><label for="player_photo_file">File:</label></td>
            <td><input name="player_photo_file" type="file" /></td>
        </tr>
    </table>
    <p class="submit"><input type="submit" value="Upload" /></p>
    </fieldset>
    </form>
