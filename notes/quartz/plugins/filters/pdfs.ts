import { QuartzFilterPlugin } from "../types";

export const RemovePDFs: QuartzFilterPlugin<{}> = () => ({
  name: "RemoveDrafts",
  shouldPublish(_ctx, [_tree, vfile]) {
    const pdfFlag: boolean = vfile.basename?.includes(".pdf") ?? false;
    return !pdfFlag;
  },
});
