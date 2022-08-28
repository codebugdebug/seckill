package com.github.lyrric;

import com.github.lyrric.ui.ConsoleMode;
import com.github.lyrric.ui.MainFrame;
import org.apache.logging.log4j.LogManager;

    private  static  final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException, ParseException, InterruptedException {
        logger.info("=================程序开始运行=================");
        if(args.length > 0 && "-c".equals(args[0].toLowerCase())){
            new ConsoleMode().start();
        }else{
            new MainFrame();
        }
        logger.info("=================程序运行结束=================");
    }

}
