package com.jiabb.commmons.cli;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import java.util.Arrays;

/**
 * BasicParser和DefaultParser只能解析基础的命令行参数
 */
@Slf4j
public class BasicParseCLI {

	public static void main(String[] args) {
		Options options = new Options();
		options.addOption("h","help",false,"print options information");
		options.addOption("d", "database", true,"name of a database");
		options.addOption("t", true, "name of a table");

		Option fileOption = Option.builder("f").argName("args").longOpt("files").hasArgs().desc("file names").build();
		options.addOption(fileOption);

		//basicParser /GnuParser/PosixParser
		DefaultParser parser = new DefaultParser();
		try {

			CommandLine cli = parser.parse(options, args);
			//如果包含-h打印 帮助命令
			if (cli.hasOption("h")) {
				HelpFormatter helpFormatter = new HelpFormatter();
				helpFormatter.printHelp("Options", options);
			} else {
				String d = cli.getOptionValue("d");
				log.info("database -> {}", d);
				String t = cli.getOptionValue("t");
				log.info("table -> {}", t);
				String[] fs = cli.getOptionValues("f");
				log.info("files -> {} ,size -> {}", Arrays.asList(fs), fs.length);
			}



		} catch (ParseException e) {
			e.printStackTrace();
		}


	}

}
