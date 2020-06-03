<?php
    require("head.php");
    require("../../../config_laf20.php");
    require("functions_database.php");
    $database = 'if19_anete_va_1';
    $filter = null;
    $notice = displayLostItems($filter);
    $url = "http://" .$_SERVER["SERVER_NAME"] .":" .$_SERVER["SERVER_PORT"] ."/~anetevaa/oo_p/LAF/main.php";

    if (isset($_POST["tehnika"])){
        $filter = 'tehnika';
        $notice = displayLostItems($filter);
    }elseif (isset($_POST["muu"])){
        $filter = 'muu';
        $notice = displayLostItems($filter);
    }elseif (isset($_POST["riided"])){
        $filter = 'riided';
        $notice = displayLostItems($filter);
    }else{
        $notice = displayLostItems($filter);
    }
?>

<body>
    <div class="main-flex header">
        <div class="main-section">
            <?php require("header.php"); ?>
        </div>
    </div>

    <div class="main-flex">
        <div class="main-section">

            <div class="flex-row"> 
                <h1 class="title">KAOTATUD ESEMED</h1>
            </div>

            <div class="flex-row"> 
                <button class="add-ad"><a href="<?php echo $url ?>">Lisa kuulutus</a></button>
            </div>

        
            <div class="flex-row"> 

                <div class="filters">
                    <h2 class="flex-column"><a href="index.php">FILTREERI</a></h2>
                    <form  class = "ul flex-column" method="POST" action="">
                        <input id="clothes" name="riided" type="submit" value="RIIDED">
                        <input id="technology" name="tehnika" type="submit" value="TEHNIKA">
                        <input id="other" name="muu" type="submit" value="MUU">
                    </form>
                </div>

                <div class="objects flex-column">

                    <?php 
                        echo $notice;
                    ?>
                    
                </div>
            </div><!--flex-row -->

        </div> <!--main section -->

    </div><!-- main-flex-->
    
</body>